package kr.re.kitri.lucidDream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by danawacomputer on 2017-06-12.
 */
@Controller
public class AmigoController {

    @RequestMapping(value = "/amigo/regist", method = RequestMethod.GET)
    public String regist() {

        return "regist";
    }


    @RequestMapping(value = "/amigo/regist", method = RequestMethod.POST)
    public ModelAndView result_regist(
            @RequestParam("amigoName") String amigoName,
            @RequestParam("amigoPhone") String amigoPhone,
            @RequestParam("amigoEmail") String amigoEmail
            ) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("result_regist");

        mav.addObject("amigoName", amigoName);
        mav.addObject("amigoPhone", amigoPhone);
        mav.addObject("amigoEmail", amigoEmail);


        return mav;
    }
}
