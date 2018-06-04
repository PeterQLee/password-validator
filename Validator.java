public class Validator{

    /* 
	   Function: checkPassword
	   -----------
	   Returns a integer score based on how many password strength conditions are passed.
    */
    public int checkPassword(String st) {
	int result=0;
	if (st.equals("password")){result++;}
	if (st.length() >= 8 ){result++;}
	return result;
    }
}
