package com.jun.message;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String printMsg(String name) {
		return "Hello " + name;
	}
}
