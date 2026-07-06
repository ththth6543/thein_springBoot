package com.jun.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalcController {

	//=================================
	// 1. 방식 개발자가 obj를 관리
	// private final CalcService calcService = new CalcService();


	//=================================
	// 2번 스프링 @Autowired 방식
	// @Autowired
	// private CalcService calcService;
	
	//=================================
	// 3. 스프링 방식: getMethod를 이용한 서비스단 사용방식

	// private CalcService calcService;

	public CalcService getCalc(){
		return new CalcService();
	}

	@GetMapping("/add")
	public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
		return getCalc().add(a, b);
	}
	
	//=================================
	// 4. 스프링 방식: 생성자를 이용한 서비스단 사용방식

	// private final CalcService calcService;


	// public CalcController(CalcService calcService){
	// 	this.calcService = calcService;
	// }

	// @GetMapping("/add")
	// public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
	// 	return calcService.add(a, b);
	// }

	// @GetMapping("/sub")
	// public int sub(@RequestParam("a") int a, @RequestParam("b") int b) {
	// 	return calcService.sub(a, b);
	// }

	// @GetMapping("/mul")
	// public int mul(@RequestParam("a") int a, @RequestParam("b") int b) {
	// 	return calcService.mul(a, b);
	// }

	// @GetMapping("/div")
	// public int div(@RequestParam("a") int a, @RequestParam("b") int b) {
	// 	return calcService.div(a, b);
	// }
}
