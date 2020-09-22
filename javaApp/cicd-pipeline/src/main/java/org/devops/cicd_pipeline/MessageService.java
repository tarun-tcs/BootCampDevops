package org.devops.cicd_pipeline;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
}