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
	public char InputChoice() {
		
		System.out.println("Enter letter: ");
		return scanner.next().toUpperCase().charAt(0);
		
		
	}
}
	

