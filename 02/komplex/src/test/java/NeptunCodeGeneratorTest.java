import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NeptunCodeGeneratorTest {

	NeptunCodeGenerator f=new NeptunCodeGenerator();
	
	@Test
	
	void neptunteszt() {
		
		
		assertEquals(0, f.getNextCounter());
		
		f.getNextCounter();
		
		assertEquals(2, f.getNextCounter());
	}

}
