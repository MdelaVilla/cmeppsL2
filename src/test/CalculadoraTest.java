package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {
	private int value1;
	private int value2;	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		value1=3;
		value2=5;
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		//fail("Not yet implemented");
		int expected=8;
		int actual=Calculadora.suma(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		//fail("Not yet implemented");
		int expected=-2;
		int actual=Calculadora.resta(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		//fail("Not yet implemented");
		int expected=15;
		int actual=Calculadora.multiplica(value1, value2);
		assertEquals(expected, actual);
		
		
	}

	@Test
	void testDivide() {
		//fail("Not yet implemented");
		int expected=0;
		int actual=Calculadora.divide(value1, value2);
		assertEquals(expected, actual);

	}

}
