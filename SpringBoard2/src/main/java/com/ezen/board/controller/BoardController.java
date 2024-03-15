package com.ezen.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ezen.board.dto.BoardDTO;
import com.ezen.board.service.BoardService;

@RequestMapping("/board")
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/")
	   public String index() {
		return "/board/index";
	}
	
	@GetMapping("/list")
	   public String list(Model model) {
		boardService.list(model);
		
		return "/board/list";
	}
	
	@GetMapping("/detail")
	public String detail(int board_id, Model model) {
		boardService.detail(board_id, model);
		return "/board/detail";
	}
	
	@GetMapping("/write")
	public String writeForm() {
		return "/board/writeForm";
	}
	
	@PostMapping("/write")
	public String write(BoardDTO dto, RedirectAttributes rattr) {
		int board_id = boardService.write(dto);
		
		if (board_id > 0) {
			rattr.addAttribute("board_id", board_id);
			return "redirect:/board/detail";
		} else {
			return "redirect:/board/writeFail";
		}
	}

}
