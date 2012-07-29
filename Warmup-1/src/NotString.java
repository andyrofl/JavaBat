/**
 * NotString
 * @author andy rofl
 * Date created: 09/26/11 09:26:48 PM
 */
public class NotString implements Testcase{

	/**
	 * notString
	 * @pre none
	 * @post String is unchanged if already started with "not", added "not " otherwise
	 */
	public String notString(String str){
		if(str.length() >= 3 && str.startsWith("not")){
			return str;
		}
		return "not " + str;
	}
	@Override
	public boolean runTest(){
		return ((notString("candy").equals("not candy")) &&
				(notString("x").equals("not x")) &&
				(notString("not bad").equals("not bad")) &&
				(notString("bad").equals("not bad")) &&
				(notString("not").equals("not")) &&
				(notString("is not").equals("not is not")) &&
				(notString("no").equals("not no")));
	}

}
