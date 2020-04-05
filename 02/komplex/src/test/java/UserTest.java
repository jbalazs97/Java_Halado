import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	
	void test2() {
		User v=new User("nev", true, "asd");
		
		assertEquals("nev", v.getName());
		assertEquals(true, v.isEnabled());
		assertEquals("asd", v.getNeptunkod());
	}
}
