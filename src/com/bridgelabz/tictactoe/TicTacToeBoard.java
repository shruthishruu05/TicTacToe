package com.bridgelabz.tictactoe;
import java.util.Scanner;
public class TicTacToeBoard 
{
	static char computerInput,humanInput,first,value,human,computer;
	static Scanner scanner = new Scanner(System.in);
	static char[] board = new char[10];
	static int desiredLocation;
	static boolean result;
	private static boolean humanInputToss;
	private static boolean win = false;
	
	public static void createBoard() 
	{
		
		for(int index=1;index<10;index++) {
				board[index] = ' ';
		}
		System.out.println("Board is this :");
		showBoard();
		
	}
		
	public static void humanMove()
	{
		//System.out.println("human turn");
		System.out.println("\nEnter Location 1-9 to Make Move");

		while (true) {

			desiredLocation = scanner.nextInt();
			if (checkIfEmpty(desiredLocation) && desiredLocation < 10 && desiredLocation > 0) {
				System.out.println("Enter the human input");
				board[desiredLocation] = humanInput;
				showBoard();
				break;
			}
			else 
			{
				System.out.println("Invalid Choice");

			}
		}
	}
	public static void computerMove() {
		do {
			System.out.println("Computer turn");
			desiredLocation = 	(int)(Math.floor(Math.random()*10)%9) + 1;								
		} while (!checkIfEmpty(desiredLocation));

		board[desiredLocation] = computerInput;
		showBoard();
	}
	
	public static boolean checkWinner() {
		if (win)
			return true;
		 char h = humanInput;
		 char c = computerInput;
		
		if ((board[1] == h && board[2] == h && board[3] == h)|| (board[4] == h && board[5] == h && board[6] == h)
				|| (board[7] == h && board[8] == h && board[9] == h)|| (board[1] == h && board[4] == h && board[7] == h)
				|| (board[2] == h && board[5] == h && board[8] == h)|| (board[3] == h && board[6] == h && board[9] == h)
				|| (board[1] == h && board[5] == h && board[9] == h)|| (board[3] == h && board[5] == h && board[7] == h))
			{
			System.out.println("human won");
			win = true;
			return true;
		}

		if ((board[1] == c && board[2] == c && board[3] == c)|| (board[4] == c && board[5] == c && board[6] == c)
				|| (board[7] == c && board[8] == c && board[9] == c)|| (board[1] == c && board[4] == c && board[7] == c)	
				|| (board[2] == c && board[5] == c && board[8] == c)|| (board[3] == c && board[6] == c && board[9] == c)
				|| (board[1] == c && board[5] == c && board[9] == c)|| (board[3] == c && board[5] == c && board[7] == c)) 
				{
				System.out.println("Computer won");
				win = true;
				return true;
		}

		return false;
	}
	public static boolean isFull() {
		if ((board[1] != ' ') && (board[2] != ' ') && (board[3] != ' ') && (board[4] != ' ') && (board[5] != ' ')
				&& (board[6] != ' ') && (board[7] != ' ') && (board[8] != ' ') && (board[9] != ' ')) {

			return true;
		}
		return false;
	}
	public static void start() 
	{
		do {
			if (humanInputToss) {
				humanMove();
				if (!isFull())
					computerMove();
			} else {
				computerMove();
				if (!isFull())
					humanMove();
			}
		} while (!checkWinner() && !isFull());
		if (isFull() && !checkWinner())
			System.out.println("tied");

	}
	public static boolean checkIfEmpty(int desiredLocation)
	{	
		if(board[desiredLocation]== ' ')
		{
			return true;
		}
		else 
		return false;
		
		
	}
	public static void showBoard() {
		System.out.println("Board representation");
		
		for(int index=1;index<10;index++) {
			
			System.out.print(board[index]+"|");
			if(index%3 == 0) System.out.println();
		}
		
	}
	public static void playerInputChoice() 
	{
		
		System.out.print("select X or O : ");
		humanInput = scanner.next().toUpperCase().charAt(0);

		if (humanInput == 'X')
			computerInput = 'O';
		else
			computerInput = 'X';
		System.out.println("human has selected : " + humanInput);
		System.out.println("Computer choice is : " + computerInput);
	
	}
	
	public static void checkWhoPlays()
	{
		System.out.println("Tossing");
		String first;

		if (Math.random() > 0.5)
			first = "computer";
		else
			first = "human";

		if (first.equals("computer")) {
			System.out.println("Computer goes first");
		}
		else {
			System.out.println("human goes first");
		}	
	}
	public static void main(String [] args) {
		createBoard();
		playerInputChoice();
		checkWhoPlays();
		//showBoard();
		start();

	}
}

