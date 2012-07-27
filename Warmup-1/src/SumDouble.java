/**
 * Sum Double
 * @author andy rofl
 * Date created: 09/11/12 07:22:59 AM
 */
public class SumDouble implements Testcase{

	/**
	 * Return the sum of the two input numbers, but if they are equal return the double the sum
	 * @pre none
	 * @post sum returned (double if 'a' and 'b' are equal)
	 */
	public int sumDouble(int a, int b){
		int sum = a + b;
		
		if(a == b){
			sum *= 2;
		}
		
		return sum;
	}
	@Override
	public boolean runTest(){
		/*
			sumDouble(1, 2) -> 3
			sumDouble(3, 2) -> 5
			sumDouble(2, 2) -> 8
			sumDouble(-1, 0) -> -1
			sumDouble(0, 0) -> 0
			sumDouble(0, 1) -> 1
		 */
		return((sumDouble(1, 2) == 3) && (sumDouble(3, 2) == 5) && (sumDouble(2,2) == 8) && (sumDouble(-1, 0) == -1) && (sumDouble(0,0) == 0) && (sumDouble(0, 1) == 1));
	}
}