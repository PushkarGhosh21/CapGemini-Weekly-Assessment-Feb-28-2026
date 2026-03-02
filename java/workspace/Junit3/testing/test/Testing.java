package test;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		EvenCheck e=new EvenCheck();
		
		assertFalse(e.Ec(12));
		
	}

}
