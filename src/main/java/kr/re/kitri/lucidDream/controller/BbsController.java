package kr.re.kitri.lucidDream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * /bbs ..전체보기
 * /bbs/15 ...상세보기(15번 글)
 * /bbs/15/modify ..수정(15번 글 수정)
 * /bbs/15/remove ..삭제(15번 글 삭제)
 * <p>
 * /bbs/write ..글 작성화면 로딩
 * /bbs/write/do ..글 작성하기
 */

@Controller
public class BbsController {

    @RequestMapping("/bbs")
    public String viewAll() {
        return "view_all";
    }

    @RequestMapping(value = "/bbs/write", method = RequestMethod.GET )
    public String write() {
        return "write";
    }

    /*
    @RequestMapping("/bbs/write/do")
    public String doWrite(HttpServletRequest request){

        String articleId = request.getParameter("article_id");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String content = request.getParameter("content");

        System.out.println(articleId);
        System.out.println(title);
        System.out.println(author);
        System.out.println(content);

        return "do_write";

    }
    */

    @RequestMapping(value = "/bbs/write", method = RequestMethod.POST)
    public ModelAndView doWrite(
            @RequestParam("article_id") String articleId,
            @RequestParam("title") String title,
            @RequestParam("author") String author,
            @RequestParam("content") String content
    ) {

        System.out.println(articleId);
        System.out.println(title);
        System.out.println(author);
        System.out.println(content);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("do_write");
        mav.addObject("articleId",articleId);
        mav.addObject("title",title);
        mav.addObject("author",author);
        mav.addObject("content",content);

        return mav;

    }


}
