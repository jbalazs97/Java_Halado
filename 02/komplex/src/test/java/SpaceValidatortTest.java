import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

class SpaceValidatortTest {

	SpaceValidator c= new SpaceValidator();
	
	@Test
	 
	void isValidTestFalse(){
		
		User d=mock(User.class);
		
		when(d.getName()).thenReturn("Vala Mi");
		
		assertFalse(c.isValid(d));
	}
    @Test
	void isValidTestTrue(){
		
		User d=mock(User.class);
		
		when(d.getName()).thenReturn("ValaMi");
		
		assertTrue(c.isValid(d));
	}
	
	
}
