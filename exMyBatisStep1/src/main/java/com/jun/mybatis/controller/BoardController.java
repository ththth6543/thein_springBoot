package com.jun.mybatis.controller;

import org.springframework.stereotype.Controller;

import com.jun.mybatis.dto.BoardDTO;
import com.jun.mybatis.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService BoardService;
	
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	@PostMapping("/save")
	public String save(BoardDTO boardDTO) {
		System.out.println("============= 콘솔값 확인 ==========");
		System.out.println("DTO = " + boardDTO);
		return "index";
	}
	
}
