package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeBoard 
{
	
	static Scanner scanner = new Scanner(System.in);
	static char[] board = new char[11];
	public void start() {
		
		for(int index=1;index<=10;index++) {
				board[index] = ' ';
		}
		System.out.println("Board is this :");
		showBoard();
		
	}
	public void showBoard() {
		
		for(int index=1;index<=10;index++) {
				System.out.print(board[index]+" ");
			
			System.out.println();
		}
	}
	
	public void InputChoice() {
		char userInput,computerInput;
		System.out.println("Enter input choice");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			 userInput='X';
			 computerInput = 'O';
		}
		else {
			userInput='O';
			computerInput = 'X';
		}
		
	}
}
	

