package com.jun.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jun.mybatis.mapper.MyMapper;
import com.jun.mybatis.model.Member;

@Service
public class MyService {

	@Autowired
	private MyMapper myMapper;
	
	public List<Member> selectMember() {
		return myMapper.selectMember();
	}
}
