package com.bridgelabz.tictactoe;

public class TicTacToeMain {
	public static void main(String [] args) {
		TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
		System.out.println("Toc Tac Tao Game");
		ticTacToeBoard.start();
		System.out.println("Please enter 'O' or 'X'");
		char userInput = ticTacToeBoard.InputChoice();
		char computerLetter = (userInput=='X')?'O':'X';
	}
}
