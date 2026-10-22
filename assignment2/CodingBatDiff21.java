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
	testDiff21(19, 2);
	testDiff21(10, 11);
	testDiff21(21, 0);
	testDiff21(22, 2);
	testDiff21(25, 8);
	testDiff21(-1, 22);
	testDiff21(-2, 23);

	}
}
