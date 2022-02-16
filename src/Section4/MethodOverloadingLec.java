package Section4;

public class MethodOverloadingLec {

	public static void main(String[] args) {
		int newScore = calculateScore("Jon", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();
		calcFeetAndInchesToCentimeters(7, 5);

	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}

	//Coding Challenge

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		if ((feet < 0) || ((inches < 0) && (inches > 12))) {
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;
	}
}
