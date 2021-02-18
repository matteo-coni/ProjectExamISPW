package logic;

public class Login {
	
	public Login() {}
	
	public String validateLogin(String username, String password) {
		
		String text = "";
    	
    	if (username.equals("")) { 
    		text = "Entrambi mancanti";
    		//return text;
    		
    	}
    	
    	if (!(username.equals(""))) {
    		text = "Username presente"; 
    		//return text;
    	}
    	
		
		return text;
	}
	
}
