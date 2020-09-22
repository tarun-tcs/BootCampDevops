package org.devops.cicd_pipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// import org.devops.cicd_pipeline.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {

	@Test
	public void testSum() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.sum(), 30);
	}
	
	@Test
	public void testSub() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.sub(), 8);
	}
	
	@Test
	public void testMul() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.mul(), 200);
	}
	
	@Test
	public void testDiv() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.div(), 5);
	}
	
	@Test
	public void testPercent() {
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.per(), 5);
	}
	
}