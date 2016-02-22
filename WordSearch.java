import java.util.Scanner;


public class WordSearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Laid Wed Stop From Fed

		char[][] gameBoardOne = {{'L', 'A', 'I', 'D', 'E', 'F', 'L', 'A', 'D'},
								 {'J', 'A', 'A', 'M', 'N', 'O', 'P', 'Q', 'R'},
							     {'S', 'V', 'D', 'V', 'A', 'T', 'Y', 'Z', 'A'},
							     {'A', 'B', 'C', 'S', 'A', 'F', 'G', 'V', 'A'},
							     {'J', 'K', 'A', 'M', 'R', 'O', 'P', 'Q', 'R'},
							     {'S', 'T', 'C', 'O', 'W', 'E', 'D', 'Z', 'L'},
							     {'A', 'B', 'M', 'D', 'E', 'F', 'G', 'H', 'Y'},
								 {'J', 'K', 'T', 'M', 'N', 'O', 'P', 'Q', 'R'},
							     {'S', 'T', 'O', 'P', 'W', 'X', 'Y', 'Z', 'E'}};
		
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
		
		
		System.out.println("Please pick a level of difficulty (easy or hard) >>> ");
		String boardChoice = input.nextLine().toUpperCase();
		
		
		char[][] currentBoard;
		if(boardChoice.equals("EASY")) {
			currentBoard = gameBoardOne;
		}
		else if(boardChoice.equals("HARD")){
			currentBoard = gameBoardTwo;
		}
		else {
			currentBoard = gameBoardOne;
		}
		String continuePlaying = "YES";
		while(continuePlaying.equals("YES")) {
			displayBoard(currentBoard);
			
			System.out.println("Please enter the word you would like to search for >>> ");
			String userWord = input.nextLine().toUpperCase();
			char firstLetter = userWord.charAt(0);
			
			
			boolean happens = checkForWord(currentBoard, userWord, firstLetter);
			System.out.println(happens);
			
			System.out.println("Do you want to continue?");
			continuePlaying = input.nextLine().toUpperCase();
		}
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
		outcome = checkDiagonalRight(row, col, userWord, currentBoard);
				if(!outcome) {
					outcome = checkDiagonalLeft(row, col, userWord, currentBoard);
				}
		return outcome;
	}
	public static boolean checkDiagonalRight(int row, int col, String userWord, char[][] currentBoard) {
		String output = "";
		int a = 0;
		while(a < userWord.length()) {
			if(row >= userWord.length() - 1 && currentBoard[row].length - col > userWord.length() - 1) {
				output += currentBoard[row - a][col + a];
				if(output.equals(userWord)) {
					return true;
				}
			}
			a++;
		}
		return false;
	}
	//9 length
	public static boolean checkDiagonalLeft(int row, int col, String userWord, char[][] currentBoard) {
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
			if(row >= userWord.length()) {
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
