package com.ezen.springrest.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@ResponseBody
	@GetMapping(value= "/fruit", produces = "text/plain; charset=UTF-8")
	public String fruit() {
		// 원래 의미: /WEB-INF/views/fruit.jsp로 포워드하겠다
		// @ResponseBody를 붙인 후 : "fruit"을 응답하겠다
		return "fruit";
	}
}
