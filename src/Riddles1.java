import java.util.Scanner;


public class Riddles1 {
	
	public static void main(String[] args) {
	
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Lets do some riddles, okay?");
		System.out.println("Please use one word answers.");
		System.out.println("You have three tries per riddle.");
		System.out.println("Please respond.");
		String okay = scnr.next();
		
		System.out.println("What has roots as nobody sees,");
		System.out.println("Is taller than trees,");
		System.out.println("Up, up it goes.");
		System.out.println("and yet never grows.");
		
		String answer = "nothing";
		int wrongAnswer = 0;
		int wrongAnswer2 = 0;
		int wrongAnswer3 = 0;
		int correctPoints = 0;
		int correctPoints2 = 0;
		int correctPoints3 = 0;
		
		while (answer != "correct") {
			answer = scnr.next();
			if (answer.matches("Mountain") || answer.matches("mountain") || answer.matches("Mountains") || answer.matches("mountains") || answer.matches("MOUNTAIN") || answer.matches("MOUNTAINS")){
				System.out.println("That is Correct!");
				System.out.println(" ");
				correctPoints = correctPoints + 1;
				answer = "correct"; 
			}
			else {
				System.out.println("That is inncorrect, Try again!");
				System.out.println(" ");
				wrongAnswer = wrongAnswer + 1;
					if (wrongAnswer == 3){
						System.out.println("You have failed thee times. You have failed this riddle");
						System.out.println(" ");
						answer = "correct";
						
					}
				
			
			}
				}
		
		System.out.println(" ");
		System.out.println("Thirty white horses on a red hill,");
		System.out.println("First they champ,");
		System.out.println("Then they stamp,");
		System.out.println("Then stand still.");
		
		String answer2 = "nothing";
			
		while (answer2 != "correct") {
			answer2 = scnr.next();
			if (answer2.matches("Teeth") || answer2.matches("teeth") || answer2.matches("TEETH")) {
				System.out.println("That is correct!");
				System.out.println(" ");
				correctPoints = correctPoints + 1;
				answer2 = "correct";
			}
			else {
				System.out.println("That is incorrect. Please try again");
				System.out.println(" ");
				wrongAnswer2 = wrongAnswer2 + 1;
					if (wrongAnswer2 == 3) {
						System.out.println("You have failed thee times. You have failed this riddle");
						System.out.println(" ");
						answer2 = "correct";
					}
			}
		}
	
		System.out.println(" ");
		System.out.println("This thing all things devours:");
		System.out.println("Birds, beats, trees, flowers;");
		System.out.println("Gnaws iron, bites steel");
		System.out.println("Grinds hard stones to meal;");
		System.out.println("Slays kings, ruins towns");
		System.out.println("And beats the high mountains down.");
		
		String answer3 = "nothing";
		
		while (answer3 != "correct") {
		answer3 = scnr.next() ;
			if (answer3.matches("Time") || answer3.matches("time") || answer3.matches("TIME")){ 
				System.out.println("This correct!");
				System.out.println(" ");
				answer3 = "correct";
				correctPoints = correctPoints + 1;
		}
		
			else {
				wrongAnswer3 = wrongAnswer3 + 1;
				System.out.println("That is incorrect. Please try again.");
				System.out.println(" ");
					if (wrongAnswer3 == 3) {
						System.out.println("You have failed thee times. You have failed this riddle");
						System.out.println(" ");
						answer3 = "correct";
						
					}
				}
			}
		
		correctPoints = correctPoints + correctPoints2 + correctPoints3;
		
		System.out.println("You have completed the riddle challenge! You got " + correctPoints + " out of 3 correct.");
		System.out.println(" ");
		if (correctPoints == 1) {
			System.out.println("Try again! You can do better!");
		}
		else if (correctPoints == 0){
			System.out.println("Better luck next time!");
		}
		else if (correctPoints == 2) {
			System.out.println("Good Job! Try again and you can get three!");
		}
		else {
			System.out.println("Congrats! You got all 3! Thats awesome!");
			scnr.close();
		}
		
			}
		}
		
	

	


