package org.devops.cicd_pipeline;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	@GetMapping("/sum")
	public int sum() {
		int a=10,b=20;
		return a+b;
	}
	
	@GetMapping("/sub")
	public int sub() {
		int a=10,b=2;
		return a-b;
	}
	
	@GetMapping("/mul")
	public int mul() {
		int a=10,b=20;
		return a*b;
	}
	
	@GetMapping("/div")
	public int div() {
		int a=10,b=2;
		return a/b;
	}
	
	@GetMapping("/per")
	public int per() {
		int a=100,b=5;
		return (a/b)*100;
	}
}