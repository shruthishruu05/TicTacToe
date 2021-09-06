package com.bridgelabz.tictactoe;
import java.util.Scanner;

public class TicTacToeBoard 
{
	static char computerInput,humanInput;
	static Scanner scanner = new Scanner(System.in);
	static char[] board = new char[10];
	public static void createBoard() 
	{
		
		for(int index=1;index<10;index++) {
				board[index] = ' ';
		}
		System.out.println("Board is this :");
		showBoard();
		
	}
	public static void moveDesiredLocation()
	{
		System.out.println("select between 1 to 9 to make a move to a desired location");
		int desiredLocation = scanner.nextInt();
		
	}
	public static void showBoard() {
		System.out.println("Board representation");
		for(int index1=0; index1<3; index1++) {
			for(int index2=0; index2<3; index2++) {
				System.out.print(board[index1+index2+1]+" | ");
			}
			System.out.print("\n");
			System.out.println("");
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
		moveDesiredLocation();
		
	}
}

