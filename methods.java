package helloworld;

public class methods {

	public static void main(String[] args) {
		calculateScore(true,800,5,200);

	}
  public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
	  
	  if(gameOver) {
		  int finalScore=score+(levelCompleted*bonus);
		  finalScore +=1000;
		  System.out.println("Your Final Score Was " + finalScore);
	  }
	  
  }
  
}
