package com.ezen.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.ezen.board.mapper.BoardMapperXML;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapperXML boardMapper;
	
	@Override
	public void getBoardList(Model model) {
		model.addAttribute("board", boardMapper.getAll());
	}
}
