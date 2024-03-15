package com.ezen.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ezen.board.dto.BoardDTO;

public interface BoardMapper {

	@Select("SELECT * FROM myboard")
	List<BoardDTO> getAll();
}
