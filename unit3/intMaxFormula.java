public class intMaxFormula{
	public static int intMax(int a, int b, int c) {
  int max = a;
  if (b > max){
    max = b;
  }
  
  if (c > max){
    max = c;
  } 

  return max;
}


	public static void main(String[] args){
		if (intMax(1, 2, 3) == 3) {
			System.out.println("Test 1: PASS");
		} else {
			System.out.println("Test 2: FAIL");
		}
			
		if (intMax(-3, -1, -2) == -1) {
			System.out.println("Test 2: PASS");
		} else {
			System.out.println("Test 2: FAIL");
			}
			
		if (intMax(5, 2, 6) == 6) {
			System.out.println("Test 3: PASS");
		} else {
			System.out.println("Test 3: FAIL");
			}
	}

}
