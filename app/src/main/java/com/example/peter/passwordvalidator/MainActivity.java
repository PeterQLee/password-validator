package com.example.peter.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkPassword(View view) {
	/*
	  Function: checkPassword
	  Called on click for check button
	  ----------------
	  Takes string from password fields and checks the
	  password strength.
	*/
	
	EditText editPassText = (EditText) findViewById(R.id.password);
	String password_entry = editPassText.getText().toString();
	int passw_score = Validator.checkPassword(password_entry);
	String retstr = null;

	/* Evaluate password strength based on the score*/
	switch(passw_score){
	case 0:
	case 1:
	case 2:
	    retstr="very weak";
	    break;
	case 3:
	case 4:
	    retstr="medium";
	    break;
	case 5:
	    retstr="strong";
	    break;
	default:
	    retstr="N/A";
	    break;
	}
	
	/* Set message for the user*/
	TextView tv_message = (TextView) findViewById(R.id.message);
	tv_message.setText(retstr);
    }
}
