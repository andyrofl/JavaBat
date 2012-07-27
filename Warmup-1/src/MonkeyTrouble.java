/**
 * Monkey Trouble
 * @author andy rofl
 * Date created: 09/11/12 07:22:02 AM
 */
public class MonkeyTrouble implements Testcase{

	/**
	 * Determine if we are FUCKED
	 * @pre none
	 * @post Return true if we shit brix, false otherwise.
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
		return(aSmile == bSmile);
	}
	@Override
	public boolean runTest(){
		/*
			monkeyTrouble(true, true) -> true
			monkeyTrouble(false, false) -> true
			monkeyTrouble(true, false) -> false
			monkeyTrouble(false, true) -> false
		*/
		return(monkeyTrouble(true, true) && monkeyTrouble(false, false) && monkeyTrouble(true, false) && monkeyTrouble(false, true));
	}
}