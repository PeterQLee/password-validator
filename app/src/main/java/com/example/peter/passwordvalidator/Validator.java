package com.example.peter.passwordvalidator;

public class Validator{

    // useless comment jargon
    public static int checkPassword(String st) {
	int result=0;
	char c;
	if (!(st.toLowerCase().equals("password"))){result++;} //password
	if (st.length() >= 8 ){result++;} //length
	
	/*check for non-alphanumeric */
	for (int i=0;i<st.length();i++) {
	    c= st.charAt(i);
	    if (!(
		  (c >= 'A' && c<='Z')||
		  (c >= 'a' && c<='z')||
		  (c >='0' && c<='9')
		  )){
		result++;
		break;
	    }
	}

	
	/* check for digit */
	
	for (int i=0;i<st.length();i++) {
	    c= st.charAt(i);
	    if (c >='0' && c<='9') {
		result++;
		break;
	    }
	}

	/*check upper and lower case*/
	int flag = 0;
	for (int i=0;i<st.length();i++) {
	    c= st.charAt(i);
	    if (c >= 'A' && c<='Z' && flag==0) {
		flag = 1;
	    }
	    if (c >= 'A' && c<='Z' && flag==-1) {
		result++;
		break;
	    }
	    if (c >= 'a' && c<='z' && flag==0) {
		flag =-1;
	    }
	    if (c >= 'a' && c<='z' && flag==1) {
		result++;
		break;
	    }
	}
	return result;
    }
}
