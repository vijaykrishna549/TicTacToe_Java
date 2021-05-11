package com.bridgelabz.tictaktoe;

import java.util.Scanner;

public class TicTacToeUC2{

    public static void main(String[] args) {
   char[] board =createBoard();
    }
	   private static char[] createBoard() {
		   char[] board = new char[10];
		   for (int i = 0; i < board.length ; i++) {
			   board[i] = ' ';
			   
		   }
		   return board;
	   }
	   Scanner userInput = new Scanner(System.in);
		 char userLetter = chooseUserLetter(userInput);
		 char computerLetter = (userLetter == 'X') ? '0' : 'X';
		   
		   
		   private static char chooseUserLetter(Scanner userInput)
		   {
			   System.out.println("Choose your leter : ");
			   return userInput.next().toUpperCase().charAt(0);
		   }
   }

