/**
 * FrontBack
 * @author andy rofl
 * Date created: 09/27/11 09:45:18 AM
 */
public class FrontBack implements Testcase{

	/**
	 * frontBack
	 * @pre none
	 * @post first and last characters removed
	 */
	public String frontBack(String str){
		int length = str.length();
		String last = "", mid = "", first = "";
		if(length > 0){
			first = str.substring(0,1);
		}
		if(length > 1){
			last = str.substring(length - 1);
			mid = str.substring(1, length - 1);
		}
		return last + mid + first;
	}
	@Override
	public boolean runTest(){
		return ((frontBack("code").equals("eodc")) &&
				(frontBack("a").equals("a")) &&
				(frontBack("ab").equals("ba")) &&
				(frontBack("abc").equals("cba")) &&
				(frontBack("").equals("")) &&
				(frontBack("Chocolate").equals("ehocolatC")) &&
				(frontBack("aavJ").equals("Java")) &&
				(frontBack("hello").equals("oellh")));
	}
}