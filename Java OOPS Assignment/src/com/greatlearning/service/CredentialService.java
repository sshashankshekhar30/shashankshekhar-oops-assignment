package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.models.Employee;


public class CredentialService {

	public String generatePassword()
	{
		int first = (int) '!'; //33
		int last = (int)  '~'; //126
		
		// int range = last - first;
		
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i=0; i<8; i++)
		{
			int randomNumber = random.nextInt(first, last);
			char randomCharacter = (char) randomNumber;
			sb.append(randomCharacter);
			
			
			//Method 2. 	By using range
			// int range = last - first;
			// Random random = new Random();
			// StringBuilder sb = new StringBuilder();
			//for(int i=0;i<8;i++)
			// {
			//int randomNumber = random.nextInt(range);
			//This will generate from 0 to 93.
			// randomNumber += first; // Converting range 0 to 93 to 33 to 126
			// char randomChar = (char)randomNumber;
			// sb.append(randomChar);
			// }
			// return sb.toString();
			// }
			// }
		}
		return sb.toString();
		
	}
	
	public String generateEmailAddress(Employee emp, String department)
	{
		String email = String.format("%s%s@%s.company.com", emp.getFirstName(), emp.getLastName(), department);
		return email;
	}
	
	public void showCredentials(String firstName, String email, String password) 
	//This function is to show credentials , single responsiblity principle to display credentials. 
	{
		System.out.printf("Dear %s your generated credentials are as follows \n"
				+ "Email --> %s \n"
				+ "Password --> %s \n",
				firstName, email, password);
	}

}
