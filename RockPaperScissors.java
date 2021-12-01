
public class RockPaperScissors {
	
	public static void rps(String choice1, String choice2) {
		
		String[] choices = {"Rock", "Paper", "Scissors"};
		
		String result = "";
		
		if (choice1.equals(choice2)) {
			
			result = "TIE";
			
		} else if ((choice1.equals(choices[0].toLowerCase()) && choice2.equals(choices[2].toLowerCase())) || (choice1.equals(choices[1].toLowerCase()) && choice2.equals(choices[0].toLowerCase())) || (choice1.equals(choices[2].toLowerCase()) && choice2.equals(choices[0].toLowerCase()))) {
			result = "Player 1 wins";
		} else {
			result = "Player 2 wins";
		}
		
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		rps("rock", "rock");

	}

}
