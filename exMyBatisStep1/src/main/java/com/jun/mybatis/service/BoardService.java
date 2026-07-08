package com.jun.mybatis.service;

import org.springframework.stereotype.Service;

import com.jun.mybatis.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;
}
