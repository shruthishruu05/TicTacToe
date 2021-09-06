package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeBoard {
	
	static Scanner scanner = new Scanner(System.in);
	static char[][] board = new char[11][11];
	public void start() {
		
		for(int index=1;index<=10;index++) {
			for(int index2=1;index2<=10;index2++) {
				board[index][index2] = 0;
			}
		}
		System.out.println("Board is this :");
		showBoard();
		
	}
	public void showBoard() {
		
		for(int index=1;index<=10;index++) {
			for(int index2=1;index2<=10;index2++) {
				System.out.print(board[index][index2]+" ");
			}
			System.out.println();
		}
	}
}
