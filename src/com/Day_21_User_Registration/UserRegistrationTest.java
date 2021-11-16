package com.Day_21_User_Registration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest 
{
	@Test
	void getTheFirstNameAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String firstName = "Arafath";	
		try 
		{
			ur.firstNameCheck(firstName);
		}
		catch (FirstNameException fne) 
		{
			Assert.assertEquals("Valid", fne.getCheck());
		}	
	}
	@Test
	void getTheFirstNameAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String firstName = "arafath";
		try
		{		
			ur.firstNameCheck(firstName);
		}
		catch(FirstNameException fne)
		{
			Assert.assertEquals("Invalid", fne.getCheck());
		}
	}
	 @Test
	void getTheLastNameAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String lastName = "Baig";	
		try
		{
			ur.lastNameCheck(lastName);
		}
		catch(LastNameException lne)
		{
			Assert.assertEquals("Valid", lne.getCheck());
		}
	}
	@Test
	void getTheLastNameAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String lastName = "baig";	
		try
		{
			ur.lastNameCheck(lastName);
		}
		catch(LastNameException lne)
		{
			Assert.assertEquals("Invalid", lne.getCheck());
		}
	}
	@Test
	void getTheEmailAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String email = "abc.XYZ@bl.co.in";
		try
		{
			ur.emailCheck(email);
		} 
		catch(EmailException ee)
		{
			Assert.assertEquals("Valid", ee.getCheck());
		}
	}@Test
	void getTheEmailAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String email = "abc";
		try
		{
			ur.emailCheck(email);
		} 
		catch(EmailException ee)
		{
			Assert.assertEquals("Invalid", ee.getCheck());
		}
	}
	@Test
	void getThePhoneNumberAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String phone = "91 9115513683";
		try
		{
			ur.phoneNumberCheck(phone);
		}
		catch(PhoneNumberException pne)
		{
			Assert.assertEquals("Valid", pne.getCheck());
		}
	}
	@Test
	void getThePhoneNumberAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String phone = "919115513683";
		try
		{
			ur.phoneNumberCheck(phone);
		}
		catch(PhoneNumberException pne)
		{
			Assert.assertEquals("Invalid", pne.getCheck());
		}
	}
	@Test
	void getThePassWordAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String password = "Arafathbaig1997$";
		try
		{
			ur.passwordCheck(password);
		}
		catch(PasswordException pe)
		{
			Assert.assertEquals("Valid", pe.getCheck());
		}
	}
	@Test
	void getThePassWordAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() throws UserRegistrationException
	{
		UserRegistration ur = new UserRegistration();
		String password = "Arafathbaig";
		try
		{
			ur.passwordCheck(password);
		}
		catch(PasswordException pe)
		{
			Assert.assertEquals("Invalid", pe.getCheck());
		}
	}
}














