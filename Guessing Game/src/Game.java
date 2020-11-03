
import java.util.Random;
import java.util.Scanner;

public class Game{
	
static Scanner input = new Scanner(System.in);  
static int tries = 3;

	public static void GameLoop() {
		
		Random ran = new Random();
		final int answer = ran.nextInt(10);
		
		System.out.println("Pick a number 1-10");
		System.out.println("Tries left: " + tries);
		
		while (tries > 0 ) {
			
			int guess = input.nextInt();
			tries = (tries - 1);
			
			if (guess == answer) {

				System.out.println("You got it!");
				System.out.println("Play again?");
				System.out.println("Y/N");
				Game.NewGame();
//				input.close();
//				System.exit(0);
				}
			if (guess != answer){ 
				
				System.out.println("Guess again.");
				System.out.println("Tries left: " + tries);
				
				} 
			if (tries == 0) {

				System.out.println("You lose. Try again?");
				System.out.println("Y/N");
				Game.NewGame();
//				input.close();
//				System.exit(0);
			}
		}
	}
	
	public static void NewGame() {
		
		String reply = input.next();
				
			if (reply == "Y") {
				
				Game.GameLoop();
				
			}
			
			if (reply == "N") {
				
				input.close();
				
			}		
		}
	
	public static void main(String[] args) {
		
		Game.GameLoop();
		Game.NewGame();

		}
	}
