import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class UserControllerTest {
	
	@Mock
	UserService userservice;
	
	@Mock
	NeptunCodeGenerator neptunCodeGenerator;
	
	@InjectMocks
	UserController usercontroller = new UserController(userservice, neptunCodeGenerator);

	@BeforeEach
	void testUserControllerConst() {
		MockitoAnnotations.initMocks(this);
	}

}
