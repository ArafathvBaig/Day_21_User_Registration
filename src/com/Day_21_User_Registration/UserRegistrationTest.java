package com.Day_21_User_Registration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest 
{
	@Test
	void getTheFirstNameAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() 
	{
		UserRegistration ur = new UserRegistration();
		String firstName = "Arafath";	
		boolean check = ur.firstNameCheck(firstName);
		Assert.assertEquals(true, check);
	}
	@Test
	void getTheFirstNameAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() 
	{
		UserRegistration ur = new UserRegistration();
		String firstName = "arafath";	
		boolean check = ur.firstNameCheck(firstName);
		Assert.assertEquals(true, check);
	}
	@Test
	void getTheLastNameAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() 
	{
		UserRegistration ur = new UserRegistration();
		String lastName = "Baig";	
		boolean check = ur.lastNameCheck(lastName);
		Assert.assertEquals(true, check);
	}
	@Test
	void getTheLastNameAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() 
	{
		UserRegistration ur = new UserRegistration();
		String lastName = "baig";	
		boolean check = ur.lastNameCheck(lastName);
		Assert.assertEquals(true, check);
	}
	@Test
	void getTheEmailAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() 
	{
		UserRegistration ur = new UserRegistration();
		String email = "abc.XYZ@bl.co.in";
		boolean check = ur.emailCheck(email);
		Assert.assertEquals(true, check);
	}@Test
	void getTheEmailAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() 
	{
		UserRegistration ur = new UserRegistration();
		String email = "abc";
		boolean check = ur.emailCheck(email);
		Assert.assertEquals(true, check);
	}
	@Test
	void getThePhoneNumberAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() 
	{
		UserRegistration ur = new UserRegistration();
		String phone = "91 9115513683";
		boolean check = ur.phoneNumberCheck(phone);
		Assert.assertEquals(true, check);
	}
	@Test
	void getThePhoneNumberAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() 
	{
		UserRegistration ur = new UserRegistration();
		String phone = "919115513683";
		boolean check = ur.phoneNumberCheck(phone);
		Assert.assertEquals(true, check);
	}
	@Test
	void getThePassWordAndCheckWhetherTheRegexCodeIsCorrectOrNotHappyCase() 
	{
		UserRegistration ur = new UserRegistration();
		String password = "Arafathbaig1997$";
		boolean check = ur.passwordCheck(password);
		Assert.assertEquals(true, check);
	}
	@Test
	void getThePassWordAndCheckWhetherTheRegexCodeIsCorrectOrNotSadCase() 
	{
		UserRegistration ur = new UserRegistration();
		String password = "arafathbaig1997$";
		boolean check = ur.passwordCheck(password);
		Assert.assertEquals(true, check);
	}
}














