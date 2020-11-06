
import java.util.Random;
import java.util.Scanner;

public class Game{

static Scanner input;  
static Scanner input2;
static int tries;
static int guess;
static String reply;
static int answer;
static boolean game;
final boolean run = true;

	public static void GameLoop() {
		
		tries = 3;
		System.out.println("Pick a number 1-10");
		System.out.println("Tries left: " + tries);
		
		game = true;
		input = new Scanner(System.in);
		Random ran = new Random();
		final int answer = ran.nextInt(10);

		
			while (tries > 0 && game == true) {
								
				tries = (tries - 1);
				int guess = input.nextInt();
				
				if (guess == answer) {
					
					System.out.println("You got it!");
					game = false;
	
					}
				else if (guess != answer && tries > 0){ 
									
					if (guess > answer) {
						
						System.out.println("Pick a lower number.");
						System.out.println("Tries left: " + tries);
						
					}
					
					else if (guess < answer) {
						
						System.out.println("Pick a higher number.");						
						System.out.println("Tries left: " + tries);
						
					}					
					} 
				else if (tries == 0 && answer != guess) {
	
					System.out.println("You lose.");
					game = false;
	
			}
		}
	}
	
	public static void NewGame() {
		
		input2 = new Scanner(System.in);
		
		while (game == false) {
			
			System.out.println("Play again? Y/N");

			String reply = input2.nextLine();
			
			if (reply.equals("Y")) {
				
				Game.GameLoop();

			} 
			
			else if (reply.equals("yes")) {
				
				Game.GameLoop();
				
			}
			
			else if (reply.equals("y")) {
				
				Game.GameLoop();
				
			}
			
			else if (reply.equals("N")){
				
				System.out.println("Goodbye.");
				break;
				
			}
			
			else if (reply.equals("no")){
				
				System.out.println("Goodbye.");
				break;
				
			}
			
			else if (reply.equals("n")){
				
				System.out.println("Goodbye.");
				break;
				
			}
			
			else {
				
				System.out.println("Please enter a valid selection.");
				
			}
		}
	}
		
	public static void main(String[] args) {
	
		Game.GameLoop();
		Game.NewGame();
	}
	}
