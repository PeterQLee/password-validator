package com.example.peter.passwordvalidator;



import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.peter.passwordvalidator.MainActivity;
import com.example.peter.passwordvalidator.R;

import org.junit.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class InstrumentTestValidator{


	@Rule
	public ActivityTestRule<MainActivity> activityrule =
			new ActivityTestRule<>(MainActivity.class);
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


	onView(withId(R.id.password)).perform(clearText(), typeText(pass1a));
	closeSoftKeyboard();
	onView(withId(R.id.validate)).perform(click());
	onView(withId(R.id.strength_message)).check(matches(withText("very weak")));

	onView(withId(R.id.password)).perform(clearText(), typeText(pass1b));
	closeSoftKeyboard();
	onView(withId(R.id.validate)).perform(click());
	onView(withId(R.id.strength_message)).check(matches(withText("very weak")));
	onView(withText("very weak")).check(matches(isDisplayed()));

	onView(withId(R.id.password)).perform(clearText(), typeText(pass1c));
	closeSoftKeyboard();
	onView(withId(R.id.validate)).perform(click());
	onView(withId(R.id.strength_message)).check(matches(withText("very weak")));


	onView(withId(R.id.password)).perform(clearText(), typeText(pass2));
	closeSoftKeyboard();
	onView(withId(R.id.validate)).perform(click());
	onView(withId(R.id.strength_message)).check(matches(withText("very weak")));

	onView(withId(R.id.password)).perform(clearText(), typeText(pass3));
	closeSoftKeyboard();
	onView(withId(R.id.validate)).perform(click());
	onView(withId(R.id.strength_message)).check(matches(withText("medium")));

	onView(withId(R.id.password)).perform(clearText(), typeText(pass4));
	closeSoftKeyboard();
	onView(withId(R.id.validate)).perform(click());
	onView(withId(R.id.strength_message)).check(matches(withText("medium")));


	onView(withId(R.id.password)).perform(clearText(), typeText(pass5));
	closeSoftKeyboard();
	onView(withId(R.id.validate)).perform(click());
	onView(withId(R.id.strength_message)).check(matches(withText("strong")));

    }
}
