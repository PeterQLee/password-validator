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


	onView((R.id.password)).perform(typeText(pass1a));
	onView(withId(R.id.submit)).perform(click());
	onView(withText("very weak")).check(matches(isDisplayed()));

	onView((R.id.password)).perform(typeText(pass1b));
	onView(withId(R.id.submit)).perform(click());
	onView(withText("very weak")).check(matches(isDisplayed()));

	onView((R.id.password)).perform(typeText(pass1c));
	onView(withId(R.id.submit)).perform(click());
	onView(withText("very weak")).check(matches(isDisplayed()));


	onView((R.id.password)).perform(typeText(pass2));
	onView(withId(R.id.submit)).perform(click());
	onView(withText("very weak")).check(matches(isDisplayed()));

	onView((R.id.password)).perform(typeText(pass3));
	onView(withId(R.id.submit)).perform(click());
	onView(withText("medium")).check(matches(isDisplayed()));

	onView((R.id.password)).perform(typeText(pass4));
	onView(withId(R.id.submit)).perform(click());
	onView(withText("medium")).check(matches(isDisplayed()));


	onView((R.id.password)).perform(typeText(pass5));
	onView(withId(R.id.submit)).perform(click());
	onView(withText("strong")).check(matches(isDisplayed()));

    }
}
