import org.junit.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static Valdiator.checkPassword;
public class TestValidator{
    @test
    public void testCheckPassword() {
	/* Test different combination for passwords */
	
	String pass1a = "password";
	String pass1b = "PasSwOrd";
	String pass1c = "hi";
	String pass2 = "Werenostrangerstoloveyouknowtherulesandsodoi";

	assertEquals(Validator.checkPassword(pass1a), 1);
	assertEquals(Validator.checkPassword(pass1b), 1);
	assertEquals(Validator.checkPassword(pass1c), 1);
	assertEquals(Validator.checkPassword(pass2), 2);
    }
}
