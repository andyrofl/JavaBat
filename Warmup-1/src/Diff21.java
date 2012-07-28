/**
 * Diff21
 * @author andy rofl
 * Date created: 09/12/11 10:04:54 AM
 */
public class Diff21 implements Testcase{

	/**
	 * @pre none
	 * @post returned the difference between 21 and n, or the difference between n and 21 times two
	 */
	public int diff21(int n){
		int lulz;
		
		if(n <= 21){
			lulz = 21 - n;
		}
		else{
			lulz = ((n - 21) * 2);
		}
		
		return lulz;
	}
	@Override
	public boolean runTest(){
		return (diff21(19) == 2 &&
				diff21(10) == 11 &&
				diff21(21) == 0 &&
				diff21(22) == 2 &&
				diff21(25) == 8 &&
				diff21(30) == 18 &&
				diff21(0) == 21 &&
				diff21(1) == 20 &&
				diff21(2) == 19 &
				diff21(-1) == 22 &
				diff21(-2) == 23 &
				diff21(50) == 58);
	}
}