package com.aloha.layout.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    /**
     * 메인페이지
     * @return
     */
    @GetMapping("/main")
    public String maString() {
        return "main";
    }
    
}
