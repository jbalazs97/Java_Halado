import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;

class UseRepositoryTest {
	
	UseRepository ur= new UseRepository();

	@Test
	void testSave() {
		
		User user=mock(User.class);
		
		when(user.getName()).thenReturn("valami");
		ur.save(user); //ezt azdtuk meg elsonek

		assertEquals(ur.findAll().size(), 1);
		assertEquals(ur.findAll().get(0), user);
		
	}

	@Test
	void testGetByNektunKod() {
		User user2=mock(User.class);
		when(user2.getNeptunkod()).thenReturn("ue2");
		ur.save(user2);
		
		assertEquals(user2, ur.getByNektunKod("ue2"));
		assertEquals(null, ur.getByNektunKod("ue2a"));
		
	}
	


	@Test
	void testFindByEnabledIsTrue() {
		User user3=mock(User.class);
		
		when(user3.isEnabled()).thenReturn(true);
		
		ur.save(user3);
		
		
		User user4=mock(User.class);
		
		when(user4.isEnabled()).thenReturn(false);
		
		ur.save(user4);
		
	
		assertEquals(user3, ur.findByEnabledIsTrue().get(0));
		
		assertEquals(ur.findByEnabledIsTrue().size(), 1);
		
	}

}
