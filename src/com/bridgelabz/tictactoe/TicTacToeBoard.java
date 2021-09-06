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
		
		System.out.println("Board");
		for(int rowIndex=0; rowIndex<3; rowIndex++) {
			for(int colIndex=0; colIndex<3; colIndex++) {
				System.out.print(" 0 ");
			}
			System.out.print("\n");
			System.out.println("");
		}
	}
	public char InputChoice() {
		
		System.out.println("Enter letter: ");
		return scanner.next().toUpperCase().charAt(0);
		
		
	}
}
	

