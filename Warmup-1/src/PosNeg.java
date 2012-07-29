/**
 * PosNeg
 * @author andy rofl
 * Date created: 09/26/11 09:51:35 PM
 */
public class PosNeg implements Testcase{

	/**
	 * posNeg
	 * @pre none
	 * @post returned true if one positive, one negative, and 'negative' is true; false otherwise
	 */
	public boolean posNeg(int a, int b, boolean negative){
		if((a > 0 && b < 0) && negative == false){
			return true;
		}
		else if((b > 0 && a < 0 ) && negative == false){
			return true;
		}
		else if(negative == true){
			if(a < 0 && b < 0){
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean runTest(){
		return (posNeg(1, -1, false) &&
				posNeg(-1, 1, false) &&
				posNeg(-4, -5, true) &&
				!posNeg(-4, -5, false) &&
				posNeg(-4, 5, false) &&
				!posNeg(-4, 5, true) &&
				!posNeg(1, 1, false) &&
				!posNeg(-1, -1, false) &&
				!posNeg(1, -1, true) &&
				!posNeg(-1, 1, true) &&
				!posNeg(1, 1, true) &&
				posNeg(-1, -1, true) &&
				posNeg(5, -5, false) &&
				posNeg(-6, 6, false) &&
				!posNeg(-5, -6, false) &&
				!posNeg(-2, -1, false) &&
				!posNeg(1, 2, false) &&
				!posNeg(-5, 6, true) &&
				posNeg(-5, -5, true));
	}
}