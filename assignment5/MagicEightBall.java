public class MagicEightBall{
	private final String reply1 = "Yes, you should do that.";
	private final String reply2 = "No, that's a horrible idea.";
	private final String reply3 = "Up to you.";
	
	public String ask(String question){
		int choice = (int) (Math.random() * 3);
		
		if (choice == 0){
			return reply1;
			} else if (choice == 1) {
				return reply2;
			} else {
				return reply3;
			}	
	}
}

class MagicEightBallTest{
	public static void main(String[] args){
		MagicEightBall ball = new MagicEightBall();
		
		String answer = ball.ask("Should I plant an apple tree?");
		if (answer.equals("Yes, you should do that.") 
		|| answer.equals("No, that's a horrible idea.") 
		|| answer.equals("Up to you.")){
			System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
	}
}
