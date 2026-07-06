package com.jun.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@Autowired
	private MsgService msgService;
	
	@GetMapping("/msg")
	public String printMsg(@RequestParam("msg") String msg) {
		return msgService.printMsg(msg);
	}

}
