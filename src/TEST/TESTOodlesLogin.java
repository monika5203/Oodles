package TEST;


import org.testng.annotations.Test;

import POM.POMOodlesLogin;
import generics.Baseclass;

@Test
public class TESTOodlesLogin extends Baseclass{

	public void login() throws InterruptedException 
	{ 
		POMOodlesLogin login=new POMOodlesLogin(driver);
		 login.Oodleslogin();
		//login.OodlesLoginA();
		//login.OodlesLoginB();
	}
}
