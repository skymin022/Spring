package com.aloha.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aloha.spring.dto.User;
import com.aloha.spring.service.UserService;

@Controller
public class UserController {
	
	// 로거
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	// 회원가입		[POST]	-/join		/user/join
	@PostMapping("/join")
	public String joinPOST(@Validated @ModelAttribute User user,
							BindingResult bindingResult
	) throws Exception { 
		// 유효성 검사
		if( bindingResult.hasErrors() ) { 
			return "join";
		}
		
		boolean result = userService.insert(user);
		if ( result )
			return "redirect:/";
		else
			return "join";
	}
	// 회원가입 		[GET] 	-/join		/user/join
	@GetMapping("/join")
	public void join(@ModelAttribute User user)  { 
		
	}
	
	// 로그인			[GET]	-/login		/user/login
    @GetMapping("/login")
    public String login() {
        return "user/login";
    }
	// 로그인 처리		[POST]	-/login		/user/login
	
	
	// 회원 정보 수정	[GET]	-/update	/user/update
	// 회원 정보 수정	[POST]	-/update	/user/update
	
	
	// 회원 탈퇴 		[GET]	-/delete	/user/delete
	// 회원 탈퇴 		[POST]	-/delete	/user/delete
	
	

}
