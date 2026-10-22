public class VampireChecker {
	public boolean isVampire(float hour, boolean awake){
		if (hour >= 6.f && hour <= 22f){
			return !awake;
		} else {
			return awake;
		}
	}	
}

class VampireTest {
	public static void main(String[] args){
		VampireChecker checker = new VampireChecker();
		
		if (checker.isVampire(12f, false)){
			System.out.println("Test 1: PASS");
		} else {
			System.out.println("Test 1: FAIL");
		}
		
		if (!checker.isVampire(12f, true)){
			System.out.println("Test 1: PASS");
		} else {
			System.out.println("Test 1: FAIL");
		}
		
		if (checker.isVampire(3f, true)){
			System.out.println("Test 1: PASS");
		} else {
			System.out.println("Test 1: FAIL");
		}
		
		if (!checker.isVampire(3f, false)){
			System.out.println("Test 1: PASS");
		} else {
			System.out.println("Test 1: FAIL");
		}
	}
}
