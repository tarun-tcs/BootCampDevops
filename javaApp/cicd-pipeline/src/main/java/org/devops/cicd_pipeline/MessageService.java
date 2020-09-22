package org.devops.cicd_pipeline;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/thanks")
	public String sayThanks() {
		return "thanks";
	}
	
	@GetMapping("/try")
	public String sayTry() {
		return "try";
	}
	
	@GetMapping("/res")
	public String sayRes() {
		return "res";
	}
	
	@GetMapping("/req")
	public String sayReq() {
		return "req";
	}
	
	
}