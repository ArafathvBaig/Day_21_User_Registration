package com.Day_21_User_Registration;

import java.util.regex.Pattern;

public class UserRegistration 
{
	UserRegistrationException ure = new UserRegistrationException();
	public String firstNameCheck(String firstName) throws UserRegistrationException, FirstNameException
	{
		try
		{	
			Pattern.matches("([A-Z][a-z]{2,})", firstName);
			throw new Exception(firstName); 
		}
		catch(Exception e)
		{
			throw new FirstNameException(firstName);
		}
	}
	public boolean lastNameCheck(String lastName) throws UserRegistrationException, LastNameException
	{
		try
		{	
			Pattern.matches("([A-Z][a-z]{2,})", lastName);
			throw new Exception(lastName); 
		}
		catch(Exception e)
		{
			throw new LastNameException(lastName);
		}
	}
	public boolean emailCheck(String email) throws UserRegistrationException, EmailException
	{
		try
		{	
			Pattern.matches("(([a-z A-Z]{3,})([.])?([a-z A-Z]{3,})?+@(bl)([.])(co)([.])?([a-z]{2})?)", email);
			throw new Exception(email); 
		}
		catch(Exception e)
		{
			throw new EmailException(email);
		}
	}
	public boolean phoneNumberCheck(String phone) throws UserRegistrationException, PhoneNumberException
	{
		try
		{	
			Pattern.matches("(([0-9]{2}) ([0-9]{10}))", phone);
			throw new Exception(phone); 
		}
		catch(Exception e)
		{
			throw new PhoneNumberException(phone);
		}
	}	
	public boolean passwordCheck(String password) throws UserRegistrationException, PasswordException
	{
		try
		{	
			Pattern.matches("(([A-Z]{1})([a-z]{7,})([0-9]{1,})([$&+,:;=?@#|'<>.-^*()%!]?))", password);
			throw new Exception(password); 
		}
		catch(Exception e)
		{
			throw new PasswordException(password);
		}
	}	
}


















