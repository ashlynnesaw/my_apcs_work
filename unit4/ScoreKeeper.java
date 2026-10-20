public class ScoreKeeper{
	private int score = 0;
	
	public int getScore(){
		return score;
	}

	public void scoreNormal(){
		score += 100;
	}

	public void scoreBonus(){
		score += 1000;
	} 
}

class ScoreKeeperTest{
	public static void main(String[] args){
		ScoreKeeper keeper = new ScoreKeeper();
		
		if(keeper.getScore() == 0) {
			System.out.println("Initial score: PASS");
		} else {
			System.out.println("Initial score: FAIL");
		}
		
		keeper.scoreNormal();
		if(keeper.getScore() == 100) {
			System.out.println("scoreNormal: PASS");
		} else {
			System.out.println("scoreNormal: FAIL");
		}	
		keeper.scoreBonus();
		if(keeper.getScore() == 1100) {
			System.out.println("scoreBonus: PASS");
		} else {
			System.out.println("scoreBonus: FAIL");
		}	
	}
}
