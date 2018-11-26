import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void test() throws BooleanException {
		assertEquals(User.error("nombreapellido","correo@gmail.com","contraseña",3,false), false);
		assertEquals(User.error("nombreapellido","correo@gmail.com","contraseña",3,true), false);
		assertEquals(User.error("nombreapellido","correogmail.com","contraseña",3,false), true);
		assertEquals(User.error("w","correogmail.com","c",3,false), true);
		assertEquals(User.error("w","correo@gmail.com","contraseña",3,false), true);
		assertEquals(User.error("nombreapellido","correo@gmail.com","c",3,false), true);
		
	}

}
