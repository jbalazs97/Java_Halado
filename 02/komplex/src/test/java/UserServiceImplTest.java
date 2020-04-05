import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UserServiceImplTest {

	@Mock
	UserModify um;
	
	@Mock
	List<Validator> validators;
	
	@InjectMocks
	 UserServiceImpl usimpl = new UserServiceImpl(um, validators);
	
	@BeforeEach
	void meghivodik() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testnemnull() {
		assertNotNull(usimpl);
	}


}
