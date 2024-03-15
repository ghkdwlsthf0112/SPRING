package com.ezen.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.board.service.BoardService;

import lombok.extern.log4j.Log4j;

@RequestMapping("/board")
@Controller
public class BoardController {
	
//	@Autowired
//	BoardService boardService;
	
	@GetMapping("/")
	   public String index() {
		return "/board/index";
	}

}
