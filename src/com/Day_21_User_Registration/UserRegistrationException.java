package com.Day_21_User_Registration;

import java.util.regex.Pattern;

public class UserRegistrationException extends Exception
{

}

class FirstNameException extends Exception
{
	public boolean check;
	public String msg;
	public FirstNameException(String firstName) 
	{
		check = Pattern.matches("([A-Z][a-z]{2,})", firstName);	
		if(check == true)
		{
			msg = "Valid";
		}
		else
		{
			msg = "Invalid";
		}
	}
	public String getCheck()
	{
		return msg;	
	}
}
class LastNameException extends Exception
{
	public boolean check;
	public String msg;
	public LastNameException(String lastName) 
	{
		check = Pattern.matches("([A-Z][a-z]{2,})", lastName);		    
		if(check == true)
		{
			msg = "Valid";
		}
		else
		{
			msg = "Invalid";
		}
	}
	public String getCheck()
	{
		return msg;	
	}
}
class EmailException extends Exception
{
	public boolean check;
	public String msg;
	public EmailException(String email) 
	{
		check = Pattern.matches("(([a-z A-Z]{3,})([.])?([a-z A-Z]{3,})?+@(bl)([.])(co)([.])?([a-z]{2})?)", email);    
		if(check == true)
		{
			msg = "Valid";
		}
		else
		{
			msg = "Invalid";
		}
	}
	public String getCheck()
	{
		return msg;	
	}
}
class PhoneNumberException extends Exception
{
	public boolean check;
	public String msg;
	public PhoneNumberException(String phone) 
	{
		check = Pattern.matches("(([0-9]{2}) ([0-9]{10}))", phone);		    
		if(check == true)
		{
			msg = "Valid";
		}
		else
		{
			msg = "Invalid";
		}
	}
	public String getCheck()
	{
		return msg;	
	}
}
class PasswordException extends Exception
{
	public boolean check;
	public String msg;
	public PasswordException(String password) 
	{
		check = Pattern.matches("(([A-Z]{1})([a-z]{7,})([0-9]{1,})([$&+,:;=?@#|'<>.-^*()%!]?))", password);	    
		if(check == true)
		{
			msg = "Valid";
		}
		else
		{
			msg = "Invalid";
		}
	}
	public String getCheck()
	{
		return msg;	
	}
}
