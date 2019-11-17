package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {
    @RequestMapping("/toLogin.do")
    public String toLogin(){
        return "login";
    }
}
