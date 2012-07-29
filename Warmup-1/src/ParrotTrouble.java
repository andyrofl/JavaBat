/**
 * ParrotTrouble
 * @author andy rofl
 * Date modified: 09/12/11 01:40:25 PM
 */
public class ParrotTrouble implements Testcase{

	/**
	 * @pre hour is between 0 & 23 inclusive
	 * @post returned true if trouble, false otherwise
	 */
	public boolean parrotTrouble(boolean talking, int hour){
		return talking && (hour < 7 || hour > 20);
	}
	
	@Override
	public boolean runTest(){
		return (!parrotTrouble(true, 7) &&
				!parrotTrouble(false, 6) &&
				parrotTrouble(true, 21) &&
				!parrotTrouble(false, 21) &&
				parrotTrouble(true, 23) &&
				!parrotTrouble(false, 23)&&
				!parrotTrouble(true, 20));
	}

}