package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;

public class ChessConsole {
	public static void printBoard(ChessMatch cm) {
		ChessPiece cmPieces[][] = cm.getPieces();
		
		int cont = 8;
		char letras[] = {'a','b','c','d','e','f','g','h'};
		for(int i=0; i<8; i++) {
			System.out.print(cont);
			for(int j=0;j<8;j++) {
				printPiece(cmPieces[i][j]);
			}
			cont--;
			System.out.println();
		}
		
		System.out.print(" ");
		for(int i=0; i<8;i++) {
			System.out.print(" " + letras[i] + " ");
		}
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print(" - ");
		}else {
			System.out.print(" "+piece.toString()+" ");
		}
	}
}
