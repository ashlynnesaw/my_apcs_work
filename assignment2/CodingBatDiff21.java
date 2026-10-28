public class CodingBatDiff21{
	public static int diff21(int n) {
	if(n <= 21) {
		return Math.abs(n - 21);
	} else {
		return (n - 21) * 2;
		}
	}
	public static void testDiff21(int n, int expected){
		int actual = diff21(n);
		if (actual == expected){
			System.out.println("diff21(" + n + ") -> Expected: " + expected + ", Got: " + actual + " PASS");
			} else {
				System.out.println("diff21(" + n + ") -> Expected: " + expected + ", Got: " + actual + " FAIL");
				}
		}
	
	public static void main(String[] args){
if (diff21(19) == 2) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (diff21(10) == 11) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (diff21(21) == 0) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
	}
}
