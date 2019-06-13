import java.util.Random; 
class Main {
  public static void main(String[] args) {
    char[][] ArrayGChar = new char[4][4];
System.out.println("Welcome to the Array Game! Move your sprite \"x\" to the \"*\" to win. If you touch the \"#\", you lose."); // Welcome message

ArrayGChar[0][0] = 'x'; // Where the sprite starts
ArrayGChar[0][1] = '0'; //Where the 0's are located on the 2D array
ArrayGChar[0][2] = '0';
ArrayGChar[0][3] = '0';
ArrayGChar[1][0] = '0';
ArrayGChar[1][1] = '0';
ArrayGChar[1][2] = '0';
ArrayGChar[1][3] = '0';
ArrayGChar[2][0] = '0';
ArrayGChar[2][1] = '0';
ArrayGChar[2][2] = '0';
ArrayGChar[2][3] = '0';
ArrayGChar[3][0] = '0';
ArrayGChar[3][1] = '0';
ArrayGChar[3][2] = '0';
ArrayGChar[3][3] = '0';
Random rand = new Random(); // Random class
int rand_int1 = rand.nextInt(4); // First random numer 0 to 3
int rand_int2 = rand.nextInt(4); // Second number 0 to 3
ArrayGChar[rand_int1][rand_int2] = '*'; // Where the end goal is located

 for(int row = 0; row < ArrayGChar.length; row++){
  for(int col = 0; col < ArrayGChar[0].length; col++){
    System.out.print(ArrayGChar[row][col] + " ");
  }
  System.out.println();// Shows the array
}
	GameDirections(winx, winy, losex, losey, game); //Calls the game method.
  }
  	public static void gamePlay(int winx, int winy, int losex, int losey, String game[][]) {
		int x = 0; // x coordinate.
		int y = 0; //y coordinate.
	for ( ;(winx!=x||winy!=y); ) { //Runs program until the "x" and "*" match.
		if (losex==x && losey==y){ //When the coordinates of "x" and "#" match, you lose!
			System.out.println("\nYou lost!");
			System.exit(0); 

Scanner kin = new Scanner(System.in); 
		System.out.print("Which direction do you want to move? ");
		String direction = kin.nextLine(); 
		if (direction.equals("up")) { 
			game[x][y] = "O";
			x = x - 1;
			if (x < 0) {
				System.out.println("Incorrect");
				x = x + 1;
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("down")) { 
			game[x][y] = "O";
			x = x + 1;
			if (x > 3) {
				x = x - 1;
				game[x][y] = "x";
				System.out.println("Incorrect");
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("left")) { 
			game[x][y] = "O";
			y = y - 1;
			if (y < 0) {
				System.out.println("Incorrect");
				y = y + 1;
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}
		if (direction.equals("right")) 
			game[x][y] = "O";
			y = y + 1;
			if (y > 3) {
				System.out.println("Incorrect");
				y = y - 1;
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}
			} else {
				game[x][y] = "x";
				for(int row = 0; row < game.length; row++){
					for(int col = 0; col < game[0].length; col++){
						System.out.print(game[row][col] + " ");
					}	
					System.out.println();
				}	
			}
		}	
	} System.out.println("\nYou won"); 
		
	}
}
 }
}