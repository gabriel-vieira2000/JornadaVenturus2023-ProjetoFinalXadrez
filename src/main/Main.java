package main;

import boardLayer.Board;
import chessLayer.ChessConsole;
import chessLayer.ChessPiece;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Board board = new Board(8,8);
		ChessConsole ui = new ChessConsole();
		ui.printBoard(new ChessPiece[8][8]);
	}
}
