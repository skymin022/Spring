package com.aloha.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aloha.security.domain.Users;
import com.aloha.security.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Slf4j
@Controller
public class HomeController {
    
    @Autowired private UserService userService;
    /**
     * 회원가입 화면
     * @return
     */
    @GetMapping("/join")
    public String join() {
        return "join";
    }
    
    @PostMapping("/join")
    public String joinPost(Users user) throws Exception{
        // 회원가입 요청 
        int result = userService.join(user);
        if(result > 0){ 
            return "redirect:/";
        }
        return "redirect:/join?error=true";
    }
    
}
