package kr.re.kitri.lucidDream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MainController - PPT. 교안Spring Framework
 * Controller : P.252참고
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "redirect:bbs/";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
