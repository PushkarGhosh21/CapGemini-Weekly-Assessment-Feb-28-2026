package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Junitstest {

	Junit j=new Junit();
	@Test
	void test() {
	
		assertEquals("olleh",j.rev("hello"));
		
	}

}
