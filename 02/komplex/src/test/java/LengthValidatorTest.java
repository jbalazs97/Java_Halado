import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


class LengthValidatorTest {
	
	LengthValidator lv = new LengthValidator();

	@Test
	void isValidTestFalse() {
		User u = mock(User.class);
		
		when(u.getName()).thenReturn("Balu");
		
		assertFalse(lv.isValid(u));
	}
	
	@Test
	void isValidTestTrue() {
		User u = mock(User.class);
		
		when(u.getName()).thenReturn("Balukakakakak");
		
		assertTrue(lv.isValid(u));
	}
	
}


