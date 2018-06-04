public class Validator{


    public static int checkPassword(String st) {
	/* 

	   Function: checkPassword
	   -----------
	   Returns a integer score based on how many password strength conditions are passed.
	*/
	int result=0;
	if (!(st.toLowerCase().equals("password"))){result++;}
	if (st.length() >= 8 ){result++;}
	return result;
    }
}
