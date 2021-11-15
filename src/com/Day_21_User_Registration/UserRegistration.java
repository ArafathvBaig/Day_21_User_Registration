package com.Day_21_User_Registration;

import java.util.regex.Pattern;

public class UserRegistration 
{
	public boolean firstNameCheck(String firstName)
	{
		boolean check = Pattern.matches("([A-Z][a-z]{2,})", firstName);
	    return check;
	}
	public boolean lastNameCheck(String lastName)
	{
		boolean check = Pattern.matches("([A-Z][a-z]{2,})", lastName);
	    return check;
	}
	public boolean emailCheck(String email)
	{
		boolean check = Pattern.matches("(([a-z A-Z]{3,})([.])?([a-z A-Z]{3,})?+@(bl)([.])(co)([.])?([a-z]{2})?)", email);
		return check;
	}
	public boolean phoneNumberCheck(String phone)
	{
		boolean check = Pattern.matches("(([0-9]{2}) ([0-9]{10}))", phone);
		return check;
	}	
	public boolean passwordCheck(String password)
	{
		boolean check = Pattern.matches("(([A-Z]{1})([a-z]{7,})([0-9]{1,})([$&+,:;=?@#|'<>.-^*()%!]?))", password);
		return check;
	}	
	public static void main(String[] args)
	{
		UserRegistration ur = new UserRegistration();
		String password = "Arafathbaig1997$";
		boolean check = ur.passwordCheck(password);
		if(check == true)
		{
			System.out.println("Password is Correct: "+password);
		}
		else
		{
			System.out.println("Password is InCorrect");
		}
	}
}









