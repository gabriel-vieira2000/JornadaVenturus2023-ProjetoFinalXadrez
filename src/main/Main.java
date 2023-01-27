package main;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import boardLayer.Board;
import boardLayer.Position;
import chessLayer.ChessConsole;
import chessLayer.ChessMatch;
import chessLayer.ChessPiece;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int rowToMove, columnToMove, rowSource, columnSource;
		Position positionToMove = new Position(-1, -1);
		Position positionSource = new Position(-1, -1);
		
		
		ChessMatch cm = new ChessMatch();
		cm.initialSetup();
		ChessConsole ui = new ChessConsole();
		System.out.println("Chess Match has Began!");
		
		while(true) {
			// Clear screen before each turn
			/*if(System.getProperty("os.name").contains("Windows")) {
				try {
					new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
				} catch (InterruptedException | IOException e) {
					e.printStackTrace();
				}
			}else {
				try {
					Runtime.getRuntime().exec("clear");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		
			ui.printBoard(cm);
			System.out.println();
			System.out.println("Choose Row and Column where are a Piece that you want to move: ");
			rowSource = 8 - input.nextInt();
			columnSource = input.nextInt() - 1;
			positionSource.setValues(rowSource, columnSource);
			System.out.println("Choose Row and Column to move a Piece: ");
			rowToMove = 8 - input.nextInt();
			columnToMove = input.nextInt() - 1;
			positionToMove.setValues(rowToMove, columnToMove);
			cm.performChessMove(positionSource, positionToMove);
		}
		
	}
}
