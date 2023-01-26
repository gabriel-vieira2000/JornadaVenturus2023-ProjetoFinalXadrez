package chessLayer;

import boardLayer.Board;

public class ChessMatch {
	private int turn;
	private Color currentPlayer;
	private boolean check, checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;

	private Board board;
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[8][8];
		for(int i=0; i < board.getRows(); i++) {
			for(int j=0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public boolean[][] possibleMoves(ChessPosition sourcePosition){
		
	}
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		
	}
	
	public ChessPiece replacePromotedPiece(String type) {
		
	}
}
