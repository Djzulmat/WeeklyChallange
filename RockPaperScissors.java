import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RockPaperScissors {
	
	public static void rps(String choice1, String choice2) {
		
		
		List<String> choices = new ArrayList<String>(Arrays.asList("Rock", "Paper", "Scissors"));
		
		List<String> choicesToLower = choices.stream().map(String :: toLowerCase).collect(Collectors.toList());
		
		
		String result = "";
		
		if (choicesToLower.contains(choice1) && choicesToLower.contains(choice2)) {
			
			if (choice1.equals(choice2)) {
				
				result = "TIE";
				
			} else if ((choice1.equals(choicesToLower.get(0)) && choice2.equals(choicesTolower.get(2).toLowerCase())) || (choice1.equals(choicesToLower.get(1)) && choice2.equals(choicesToLower.get(0))) || (choice1.equals(choicesToLower.get(2)) && choice2.equals(choicesToLower.get(1)))) {
				
				result = "Player 1 wins";
				
			} else {
				
				result = "Player 2 wins";
				
			}
			
		} else {
			
			result = "Invalid input. Either choice1 or choice2 is incorrect. Please check and input correct version";
			
		}
		
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		rps("paper", "rock");
		rps("rock", "paper");
		rps("paper", "scissors");
		rps("rock", "rock");
		rps("scissors", "paper");
		rps("scissors", "blahhh");
		

	}

}
