import java.util.ArrayList;
import java.util.Scanner;


public class WordSearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isOfficialWord;
		boolean continuePlaying = true; //used to determine whether or not the player wants to exit

		String[] wordsInGameBoardOne = {"BLUE", "ORANGE", "BLACK", "RED", "GREEN", "YELLOW"};
		String[] wordsInGameBoardTwo = {"This"}; // The reason for this array is so I could add the code for the words in the second board
		ArrayList<String> wordsGuessed = new ArrayList<String>(wordsInGameBoardOne.length); // I don't understand why the size of the array is wordsInGameBoardOne.length, are you making another array for Board 2? 

		char[][] gameBoardOne = {{'F', 'I', 'D', 'W', 'Q', 'E', 'J', 'P', 'F', 'C'},
								 {'N', 'E', 'E', 'R', 'G', 'U', 'N', 'Q', 'V', 'M'},
								 {'R', 'B', 'E', 'X', 'J', 'L', 'H', 'C', 'L', 'O'},
								 {'C', 'C', 'P', 'J', 'J', 'B', 'S', 'V', 'W', 'R'},
								 {'K', 'P', 'V', 'L', 'L', 'Y', 'Z', 'X', 'W', 'A'},
								 {'K', 'C',	'O', 'U', 'E', 'J', 'M', 'T', 'N', 'N'},
								 {'T', 'Y', 'A', 'L', 'T', 'K', 'X', 'Q', 'Q', 'G'},
								 {'G', 'Z', 'L', 'L', 'P', 'K', 'F', 'P', 'N', 'E'},
								 {'J', 'O', 'H', 'L', 'B', 'A', 'X', 'Q', 'W', 'O'},
								 {'W', 'D', 'U', 'C', 'D', 'G', 'I', 'G', 'Q', 'U'}};
		
		char[][] gameBoardTwo = {{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'A', 'B', 'C', 'D', 'E', 'N', 'M', 'A', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
								 {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'}};
		
		

		
		
		char[][] currentBoard;

		
	
		System.out.println("Welcome to WORDSEARCH"); //just an official start to the game 
		
		System.out.println("Please pick a level of difficulty (easy or hard) >>> ");
		String boardChoice = input.nextLine().toUpperCase();
		
		if(boardChoice.equals("EASY")) {
			currentBoard = gameBoardOne;
		}
		else if(boardChoice.equals("HARD")){
			currentBoard = gameBoardTwo;
		}
		else {
			currentBoard = gameBoardOne;
		}
		
		//letting the player know how many words they are looking for
		if(currentBoard == gameBoardOne) 
			System.out.println("There are " + wordsInGameBoardOne.length + " words hidden in this puzzle"); 
		else 
			System.out.println("There are ... words hidden in the puzzle"); // we haven't yet coded words for the second game board
			
			
			displayBoard(currentBoard); //displaying the game board 
			System.out.println(); //again for layout 
			
		while(continuePlaying){	
			System.out.println("Please enter the word you would like to search for or exit to quit the game >>> ");
			String userWord = input.nextLine().toUpperCase();
			char firstLetter = userWord.charAt(0);
			 
			
			if(userWord.equals("EXIT")){
				System.out.println("Exiting...");  
				break; 
			}
			
				
			boolean happens = checkForWord(currentBoard, userWord, firstLetter);
		
			if(currentBoard == gameBoardOne) {
				isOfficialWord = checkForWordInArray(userWord, wordsInGameBoardOne);
			}
			else {
				isOfficialWord = checkForWordInArray(userWord, wordsInGameBoardTwo);
			}
			if(wordsGuessed.contains(userWord)) {
				System.out.println("You already guessed that!");
			}
			else if(happens && isOfficialWord) {
				System.out.println("That is correct!");
				wordsGuessed.add(userWord);
			}
			else if(happens && !isOfficialWord){
				System.out.println("That word is on the board, but it's not what I was looking for.");
			}
			else {
				System.out.println("I can't find that word.");
			}
			

			
			//if all words are found let the player know, so far I only coded this for game 1 
			if(wordsGuessed.size() == wordsInGameBoardOne.length){
				System.out.println("You found all the words. You Win!"); 
				break; 
			}
		}
	}
			
	
	
	public static boolean checkForWordInArray(String userWord, String[] officalWords) {
		for(int i = 0; i < officalWords.length; i++) {
			if(officalWords[i].equals(userWord)) {
				return true;
			}
		}
		return false;
	}
	public static boolean checkForWord(char[][] currentBoard, String userWord, char firstLetter) {
		boolean wordHappens = false;
		outerloop:
		for(int i = 0; i < currentBoard.length; i++) {
			for(int j = 0; j < currentBoard[i].length; j++) {
				if(currentBoard[i][j] == firstLetter) {
					wordHappens = checkForWordHorizontal(i, j, userWord, currentBoard);
					if(wordHappens) {
						break outerloop;
					}
					wordHappens = checkForWordVertical(i, j, userWord, currentBoard);
					if(wordHappens) {
						break outerloop;
					}
					wordHappens = checkForWordDiagonal(i, j, userWord, currentBoard);
					if(wordHappens) {
						break outerloop;
					}
				}
			}
		}
		return wordHappens;
	}
	
	public static boolean checkForWordDiagonal (int row, int col, String userWord, char[][] currentBoard) {
		boolean outcome;
		outcome = checkTopLeftToBottomRight(row, col, userWord, currentBoard);
				if(!outcome) {
					outcome = checkBottomRightToTopLeft(row, col, userWord, currentBoard);
					if(!outcome) {
						outcome = checkTopRightToBottomLeft(row, col, userWord, currentBoard);	
						if(!outcome) {
							outcome = checkBottomLeftToTopRight(row, col, userWord, currentBoard);
						}
					}
				}
		return outcome;
	}
	public static boolean checkTopLeftToBottomRight(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		while(a < userWord.length()) {
			if(currentBoard[row].length - col >= userWord.length() && currentBoard.length - row >= userWord.length()) {
				output += currentBoard[row + a][col + a];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
	public static boolean checkBottomRightToTopLeft(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		
		while(a < userWord.length()) {
			if(row >= userWord.length() - 1&& col >= userWord.length() - 1) {
				output += currentBoard[row - a][col - a];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
	public static boolean checkBottomLeftToTopRight(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		while(a < userWord.length()) {
			if(row >= userWord.length() - 1 && currentBoard[row].length - col >= userWord.length()) {
				output += currentBoard[row - a][col + a];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
	
	public static boolean checkTopRightToBottomLeft(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		while(a < userWord.length()) {
			if(col >= userWord.length() - 1 && currentBoard[row].length - row >= userWord.length()) {
				output += currentBoard[row + a][col - a];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
	//-------------------------------------------------------------------------------------------------------
	public static boolean checkForWordVertical(int row, int col, String userWord, char[][] currentBoard){
		boolean outcome;
		outcome = checkDown(row, col, userWord, currentBoard);
		if(!outcome) {
			outcome = checkUp(row, col, userWord, currentBoard);
		}
		return outcome;
	}
	public static boolean checkUp(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		
		while( a < userWord.length()) {
			if(row >= userWord.length() - 1) {
				output += currentBoard[row - a][col];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
	public static boolean checkDown(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		
		while( a < userWord.length()) {
			if(currentBoard[row].length - row >= userWord.length()) {
				output += currentBoard[row + a][col];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
	//----------------------------------------------------------------------------------------------------
	public static boolean checkForWordHorizontal(int row, int col, String userWord, char[][] currentBoard) {
		boolean outcome;
		outcome = checkRight(row, col, userWord, currentBoard);
		if(!outcome) {
			outcome = checkLeft(row, col, userWord, currentBoard);
		}
		return outcome;
	}
	public static boolean checkRight(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		while(a < userWord.length()) {
			if(currentBoard[row].length - col > userWord.length() - 1) {	
				output += currentBoard[row][col + a];
				if(output.equals(userWord)) {
					return true;
				}
				
			}
			a++;
			
		}
		return false;
	}
	public static boolean checkLeft(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		while(a <= userWord.length() - 1) {
			if(col >= userWord.length() - 1) {
				output += currentBoard[row][col - a];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
//------------------------------------------------------------------------------------------------------------------
	public static void displayBoard(char[][] gameBoard) {
		int row, col;
		for(row = 0; row < gameBoard.length; row++) {
			for(col = 0; col < gameBoard[row].length; col++) {
				System.out.print(gameBoard[row][col] + " ");
			}
			System.out.println();
		}
	}

}

