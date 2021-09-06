package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class TicTacToeBoard 
{
	static char computerInput,humanInput;
	static Scanner scanner = new Scanner(System.in);
	static char[] board = new char[10];
	static int desiredLocation;
	public static void createBoard() 
	{
		
		for(int index=1;index<10;index++) {
				board[index] = ' ';
		}
		System.out.println("Board is this :");
		showBoard();
		
	}
	public static boolean checkIfEmpty(int desiredLocation)
	{	
		if(board[desiredLocation]== ' ')
		{
			return true;
		}
		else 
				System.out.println("canot make a move as empty space is not available");
		return false;
		
		
	}
	private static void moveDesiredLocation(char value,boolean result) 
	{
		if(result == true)
		{
		board[desiredLocation] = value;
		showBoard();
		}
		else {
			System.out.println("location occupied");
		}
		
	}
	public static void showBoard() {
		System.out.println("Board representation");
		
		for(int index=1;index<10;index++) {
			
			System.out.print(board[index]+"|");
			if(index%3 == 0) System.out.println();
		}
		
	}
	public static void playerInputChoice() {
		
		System.out.println("Enter letter: ");
	char choice =  scanner.next().toUpperCase().charAt(0);
		char result = (computerInput =='X')? 'X':'0';
		
	}
	
	public static void main(String [] args) {
		playerInputChoice();
		createBoard();
		System.out.println("Enter a desired location");
		desiredLocation = scanner.nextInt();
		boolean result = checkIfEmpty(desiredLocation);
		System.out.println("Enter the value");
		char value = scanner.next().charAt(0);
		moveDesiredLocation(value,result);
	}
	
}

