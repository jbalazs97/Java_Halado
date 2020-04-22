package szamolteszt;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import szamolapi.Szamol;

class SzamolTeszt {

	@Test
	void testDefaultCosntructor() {
		Szamol calc = new Szamol();
		
		assertNotNull(calc);
	}
	
	@Test
	void testGettersSetters() {
		int a = 2;
		int b = 5;
		char c = '+';
		
		Szamol calc = new Szamol();
		calc.setLeftOperand(a);
		calc.setRightOperand(b);
		calc.setOperator(c);
		
		assertEquals(calc.getLeftOperand(), a);
		assertEquals(calc.getRightOperand(), b);
		assertEquals(calc.getOperator(), c);
	}
	
	@Test
	void testToString() {
		Szamol calc = new Szamol();
		
		assertNotNull(calc.toString());
	}
	
	@Test
	void testHashCode(){
		Szamol calc = new Szamol();
		
		assertNotNull(calc.hashCode());
	}
	
	@Test
	void testEquals() {
		int a = 2;
		int b = 5;
		char c = '+';
		
		Szamol calc = new Szamol();
		calc.setLeftOperand(a);
		calc.setRightOperand(b);
		calc.setOperator(c);
		
		Szamol calc2 = new Szamol();
		calc2.setLeftOperand(a);
		calc2.setRightOperand(b);
		calc2.setOperator(c);
		
		assertTrue(calc.equals(calc2));
	}
}
