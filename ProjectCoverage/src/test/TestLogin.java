package test;

import static org.junit.Assert.*;
import logic.Login;
import org.junit.Test;

public class TestLogin {

	
	@Test
	public void testLoginEmptyField() {
		
		String username = "";
		String password = "";
		
		Login login = new Login();
		String result = login.validateLogin(username, password); 
		String text = "Entrambi mancanti";
		 
		assertEquals(text, result);
		
	}
	
	@Test
	public void testLoginEmpty() {
		
		String username = "Matteo";
		String password = "";
		
		Login login = new Login();
		String result = login.validateLogin(username, password); 
		String text = "Username presente";
		
		assertEquals(text, result);
		
	}
}
