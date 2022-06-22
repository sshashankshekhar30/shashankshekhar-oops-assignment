package com.greatlearning;
import java.util.*;
import com.greatlearning.service.CredentialService;
import com.greatlearning.models.Employee;

public class Driver {

	public static void main(String[] args) 
	{
Employee emp = new Employee("Shashankshekhar","Singh");
		
		System.out.println("Menu");
		System.out.println("1. Technical \n"
				+ "2. Admin \n"
				+ "3. Human Resources \n"
				+ "4. Legal ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String department;
		
		switch(input)
		{
		case 1: department = "Tech";
		break;
		case 2: department = "Admin";
		break;
		case 3: department = "HR";
		break;
		case 4: department = "Legal";
		break;
		default:throw new IllegalArgumentException("Illegal input"+input);
		}
		
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(emp, department);
		String password = cs.generatePassword();
		cs.showCredentials(emp.getFirstName(), email, password);
	}

}
