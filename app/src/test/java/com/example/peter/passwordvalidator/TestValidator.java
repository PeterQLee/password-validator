package com.example.peter.passwordvalidator;

import com.example.peter.passwordvalidator.Validator;

import org.junit.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import Validator.*;
//import static Validator.checkPassword;
public class TestValidator{
    @Test
    public void testCheckPassword() {
	/* Test different combination for passwords */
	
	String pass1a = "password";
	String pass1b = "PasSwOrd";
	String pass1c = "hi";
	String pass2 = "werenostrangerstoloveyouknowtherulesandsodoi";
	String pass3 = "HelloThere";
	String pass4 = "HelloThere0";
	String pass5 = "HelloThere0^";

	assertEquals(Validator.checkPassword(pass1a), 1);
	assertEquals(Validator.checkPassword(pass1b), 2);
	assertEquals(Validator.checkPassword(pass1c), 1);
	assertEquals(Validator.checkPassword(pass2), 2);
	assertEquals(Validator.checkPassword(pass3), 3);
	assertEquals(Validator.checkPassword(pass4), 4);
	assertEquals(Validator.checkPassword(pass5), 5);
    }
}
