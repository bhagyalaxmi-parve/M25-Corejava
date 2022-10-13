package org.tnsindia.customexception;

import java.util.Scanner;

//custom Exception for validating the user Login Credential


@SuppressWarnings("serial")
class LoginCredentials extends Exception{
	public String str;

	//constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
}
}
public class User_Login_CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String id=sc.nextLine();
		String password=sc.nextLine();
		try {
			if(id!="bhagyalaxmi123@gmail.com" && password!="cdx@123")
				throw new LoginCredentials("Invalid Credentials");
			
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled "+e);
		}

	}

}
