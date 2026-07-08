package com.jun.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jun.mybatis.dto.BoardDTO;
import com.jun.mybatis.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardRepository boardRepository;
	
	public void save(BoardDTO dto) {
		boardRepository.save(dto);
	}
	
	public List<BoardDTO> findAll() {
		return boardRepository.findAll();
	}
}
