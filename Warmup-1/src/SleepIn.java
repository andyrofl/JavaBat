/**
 * Sleep In
 * @author andy rofl
 * Date created: 08/11/12 07:21:45 AM
 */
public class SleepIn implements Testcase{

	/**
	 * Determine whether or not we sleep in
	 * @pre none
	 * @post Return true if we sleep in, false otherwise.
	 */
	public boolean sleepIn(boolean weekday, boolean vacation){
		return(!weekday || vacation);
	}
	@Override
	public boolean runTest(){
		return (sleepIn(false, false) &&
				!sleepIn(true, false) &&
				sleepIn(false, true) &&
				sleepIn(true, true));
	}
}