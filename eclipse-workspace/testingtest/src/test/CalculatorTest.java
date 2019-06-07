package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator c = new Calculator();
	
	@Before
	public void setup() {
		c=new Calculator();
		System.out.println("setup()");
	}
	
	@Test
	public void testSum() {
		assertEquals(10, c.sum(5, 5));
		System.out.println("sum()");
	}

	@Test
	public void testMultiple() {
		assertEquals(25, c.multiple(5, 5));
		System.out.println("multiple()");
	}
}