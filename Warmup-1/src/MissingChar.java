/**
 * MissingChar
 * @author andy rofl
 * Date created: 09/27/11 09:44:56 AM
 */
public class MissingChar implements Testcase{

	/**
	 * missingChar
	 * @pre str is not empty, n is a valid index of a char in str
	 * @post character at index n removed
	 */
	public String missingChar(String str, int n){
		return str.substring(0, n) + str.substring(n + 1, str.length());
	}
	@Override
	public boolean runTest(){
		return ((missingChar("kitten", 1).equals("ktten")) &&
				(missingChar("kitten", 0).equals("itten")) &&
				(missingChar("kitten", 4).equals("kittn")) &&
				(missingChar("Hi", 0).equals("i")) &&
				(missingChar("Hi", 1).equals("H")) &&
				(missingChar("code", 0).equals("ode")) &&
				(missingChar("code", 1).equals("cde")) &&
				(missingChar("code", 2).equals("coe")) &&
				(missingChar("code", 3).equals("cod")) &&
				(missingChar("chocolate", 8).equals("chocolat")));
	}
}