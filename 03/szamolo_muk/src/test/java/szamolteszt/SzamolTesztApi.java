package szamolteszt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import szamolapi.Szamol;
import szamolapi.SzamolApi;

class SzamolTesztApi {

	@Test
	void testNullCalculation() {
		Szamol calc = new Szamol();
		
		assertEquals(Double.MIN_VALUE, (SzamolApi.calculateResult(calc)));
	}
	
	@Test
	void testCalculationWithNotNullOperatorButNullOperands() {
		Szamol calc = new Szamol();
		calc.setOperator('+');
		
		assertNotNull((SzamolApi.calculateResult(calc)));
	}
	
	@Test
	void testCalculationWithNotNullLeftOperand() {
		Szamol calc = new Szamol();
		int a = 5;
		
		calc.setOperator('+');
		calc.setLeftOperand(a);
		
		assertEquals(a, (SzamolApi.calculateResult(calc)));
		
	}
	
	@Test
	void testCalculationWithNotNullRightOperand() {
		Szamol calc = new Szamol();
		int a = 5;
		
		calc.setOperator('+');
		calc.setRightOperand(a);
		
		assertEquals(a, (SzamolApi.calculateResult(calc)));
		
	}

	@Test
	void testAddition() {
		Szamol calc = new Szamol();
		int a = 5;
		int b = 4;
		char c = '+';
		calc.setOperator(c);
		calc.setLeftOperand(a);
		calc.setRightOperand(b);
		
		int expected = a + b;
		
		assertEquals(expected, (SzamolApi.calculateResult(calc)));
	}
	
	@Test
	void testSubtraction() {
		Szamol calc = new Szamol();
		int a = 5;
		int b = 4;
		char c = '-';
		calc.setOperator(c);
		calc.setLeftOperand(a);
		calc.setRightOperand(b);
		
		int expected = a - b;
		
		assertEquals(expected, (SzamolApi.calculateResult(calc)));
	}
	
	@Test
	void testMultiplication() {
		Szamol calc = new Szamol();
		int a = 5;
		int b = 4;
		char c = '*';
		calc.setOperator(c);
		calc.setLeftOperand(a);
		calc.setRightOperand(b);
		
		int expected = a * b;
		
		assertEquals(expected, (SzamolApi.calculateResult(calc)));
	}
	
	@Test
	void testDivision() {
		Szamol calc = new Szamol();
		int a = 5;
		int b = 4;
		char c = '/';
		calc.setOperator(c);
		calc.setLeftOperand(a);
		calc.setRightOperand(b);
		
		int expected = a / b;
		
		assertEquals(expected, (SzamolApi.calculateResult(calc)));
	}
	
	
	@Test
	void testDefaultConstructor() {
		//this is only for that sweet sweet 100% coverage
		
		SzamolApi api = new SzamolApi();
		
		assertNotNull(api);
	}
	
	@Test
	void testNullDivision(){
		Szamol calc = new Szamol();
		int a = 5;
		int b = 0;
		char c = '/';
		calc.setOperator(c);
		calc.setLeftOperand(a);
		calc.setRightOperand(b);
		
		assertThrows(ArithmeticException.class, () -> SzamolApi.calculateResult(calc));
	}
}
