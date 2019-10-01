import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {
	public PasswordAuthentication getPasswordAuthentication(){
		String user="khan.adib0786@gmail.com ";
		String pass="sarahadib7";
		return new PasswordAuthentication(user, pass);
		
	}

}
