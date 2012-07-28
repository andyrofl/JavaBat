/**
 * Makes10
 * @author andy rofl
 * Date created: 09/12/11 02:21:21 PM
 */
public class Makes10 implements Testcase{

	/**
	 * @pre none
	 * @post appropriate action taken
	 */
	public boolean makes10(int a, int b){
	 	return (a == 10 || b == 10 || a+b == 10);
	}
	@Override
	public boolean runTest(){
		return (makes10(9, 10) &&
				!makes10(9, 9) &&
				makes10(1, 9) &&
				makes10(10, 1) &&
				makes10(10, 10) &&
				makes10(8, 2) &&
				!makes10(8, 3) &&
				makes10(10, 42) &&
				makes10(12, -2));
	}
}