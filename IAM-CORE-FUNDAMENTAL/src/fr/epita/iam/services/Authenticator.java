package fr.epita.iam.services;

public class Authenticator {
	
	/**
	 * Checking the authentication
	 * @param userName
	 * @param password
	 * @return
	 * @author ahamed
	 */
public static boolean authenticate(String userName, String password)
{
		
		return "a".equals(userName) && "a".equals(password);
}

}
