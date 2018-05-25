package com.reactiveworks.jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JacocoTest {
	
	

	@Test
	public void jacocoAdditionTest(){
		Calculator calc = new Calculator();
		assertEquals(12,calc.addition(7,5));
	}
	
}
