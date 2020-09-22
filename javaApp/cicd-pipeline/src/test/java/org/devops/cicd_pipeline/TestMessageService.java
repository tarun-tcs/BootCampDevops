package org.devops.cicd_pipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// import org.devops.cicd_pipeline.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello");
	}
	
	public void testThanks() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sayThanks(), "thanks");
	}
	
	public void testTry() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sayTry(), "try");
	}
	
	public void testRes() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sayRes(), "res");
	}
	
	public void testReq() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sayReq(), "req");
	}
	
}