/**
 * Front3
 * @author andy rofl
 * Date created: 09/27/11 09:57:22 AM
 */
public class Front3 implements Testcase{

	/**
	 * front3
	 * @pre none
	 * @post front copied three times
	 */
	public String front3(String str){
		int length = str.length();
		if(length < 3){
			return str + str + str;
		}
		else{
			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
		}
	}
	@Override
	public boolean runTest(){
		return ((front3("Java").equals("JavJavJav")) &&
				(front3("Chocolate").equals("ChoChoCho")) &&
				(front3("abc").equals("abcabcabc")) &&
				(front3("ab").equals("ababab")) &&
				(front3("a").equals("aaa")) &&
				(front3("").equals("")));
	}
}
