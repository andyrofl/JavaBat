/**
 * NearHundred
 * @author andy rofl
 * Date created: 09/26/11 09:48:18 PM
 */
public class NearHundred implements Testcase{

	public boolean nearHundred(int n){
		if(n >= 90 && n <= 110){
			return true;
		}
		else if(n >= 190 && n <= 210){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public boolean runTest(){
		return (nearHundred(93) &&
				nearHundred(90) &&
				!nearHundred(89) &&
				nearHundred(110) &&
				!nearHundred(111) &&
				!nearHundred(121) &&
				!nearHundred(0) &&
				!nearHundred(5) &&
				nearHundred(191) &&
				!nearHundred(189) &&
				nearHundred(190) &&
				nearHundred(200) &&
				nearHundred(210) &&
				!nearHundred(211) &&
				!nearHundred(290));
	}

}
