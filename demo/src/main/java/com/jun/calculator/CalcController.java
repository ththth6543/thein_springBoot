package com.jun.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalcController {

	private final CalcService calcService;
	
	public CalcController(CalcService calcService) {
		this.calcService = calcService;
	}
	
	@GetMapping("/add")
	public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
		return calcService.add(a, b);
	}
	
	@GetMapping("/sub")
	public int sub(@RequestParam("a") int a, @RequestParam("b") int b) {
		return calcService.sub(a, b);
	}
	
	@GetMapping("/mul")
	public int mul(@RequestParam("a") int a, @RequestParam("b") int b) {
		return calcService.mul(a, b);
	}
	
	@GetMapping("/div")
	public int div(@RequestParam("a") int a, @RequestParam("b") int b) {
		return calcService.div(a, b);
	}
	
}
