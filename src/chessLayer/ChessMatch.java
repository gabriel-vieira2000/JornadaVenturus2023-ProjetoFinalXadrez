package chessLayer;

import boardLayer.Board;
import boardLayer.BoardException;
import boardLayer.Position;

public class ChessMatch {
	private int turn;
	private Color currentPlayer;
	private boolean check, checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;

	private Board board;
	
	public void initialSetup() {
		this.board = new Board(8,8);
		Rook blackRook = new Rook(this.board, Color.BLACK);
		King blackKing = new King(this.board, Color.BLACK);
		Rook whiteRook = new Rook(this.board, Color.WHITE);
		King whiteKing = new King(this.board, Color.WHITE);
		
		this.board.placePiece(whiteKing, new Position(7,3));
		this.board.placePiece(whiteRook, new Position(7,2));
		this.board.placePiece(whiteRook, new Position(7,4));
		this.board.placePiece(whiteRook, new Position(6,2));
		this.board.placePiece(whiteRook, new Position(6,3));
		this.board.placePiece(whiteRook, new Position(6,4));
		
		this.board.placePiece(blackKing, new Position(0,3));
		this.board.placePiece(whiteRook, new Position(0,2));
		this.board.placePiece(whiteRook, new Position(0,4));
		this.board.placePiece(whiteRook, new Position(1,2));
		this.board.placePiece(whiteRook, new Position(1,3));
		this.board.placePiece(whiteRook, new Position(1,4));
		this.board.placePiece(whiteRook, new Position(1,4));
		this.board.placePiece(whiteRook, new Position(1,8));

	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i < board.getRows(); i++) {
			for(int j=0; j < board.getColumns(); j++) {
				mat[i][j] = board.piece(i, j);
			}
		}
		return mat;
	}
	
	public boolean[][] possibleMoves(Position sourcePosition){
		this.board.piece(sourcePosition).possibleMoves();
	}
	
	public void performChessMove(Position sourcePosition, Position targetPosition) {
		if(this.board.piece(sourcePosition) == null) {
			new BoardException("The position selected has no one piece!");
		}else {
			this.board.placePiece(this.board.piece(sourcePosition), targetPosition);
			this.board.placePiece(null, sourcePosition);
			this.board.piece(targetPosition).increaseMoveCount();
		}
	}
	
	public ChessPiece replacePromotedPiece(String type) {
		
	}
}
