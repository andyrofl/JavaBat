/**
 * Interface for testing methods
 * @author andy rofl
 * Date created 26/07/12
 */
public interface Testcase{
	
	/**
	 * @pre method to test must exist
	 * @post returned true if method passes all specific test cases, false otherwise.
	 * ** THIS METHOD CANNOT TEST "other test cases" **
	 */
	public boolean runTest();
}