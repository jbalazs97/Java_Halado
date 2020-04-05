import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

class UserDtoTest {

	@Test
	void teszt3() {
		
		UserDto as =new UserDto("name");
		
		assertNotNull(as);
		
		assertEquals("name", as.getName());
		
		
	}
	@Test
	void teszt4() {
		UserDto teszt=mock(UserDto.class);
		
		when(teszt.getName()).thenReturn("name");
		
		assertEquals("name", teszt.getName());

		
	}
	@Test
	void teszt5() {
	
		UserDto teszt2=new UserDto("name");
		teszt2.setName("mas");
		
		assertEquals("mas", teszt2.getName());

		
	}
}
