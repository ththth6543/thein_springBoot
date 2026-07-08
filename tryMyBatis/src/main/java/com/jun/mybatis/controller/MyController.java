package com.jun.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.jun.mybatis.model.Member;
import com.jun.mybatis.service.MyService;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@Autowired
	private MyService myService;
	
	@GetMapping("member")
	public List<Member> getMember() {
		
		List<Member> list = myService.selectMember();
		
		return list;
	}
}
