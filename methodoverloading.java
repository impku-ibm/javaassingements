package helloworld;

public class methodoverloading {

	public static void main(String[] args) {
		int newScore = calculateScore("TIm" ,500);
		System.out.println("New score is " + newScore);

	}
	public static int calculateScore(String playername, int score) {
		System.out.println("Player"+playername + "scored"+score+"points");
		return score *1000;
	}

}
