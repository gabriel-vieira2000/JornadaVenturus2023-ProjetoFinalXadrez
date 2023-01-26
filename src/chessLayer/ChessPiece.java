package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;
import boardLayer.Position;

public class ChessPiece extends Piece{
	private Color color;
	private int moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
		this.moveCount = 0;
	}

	public ChessPosition getChessPosition() {
		
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		return false;
	}
	
	protected void increaseMoveCount() {
		this.moveCount++;
	}
	
	protected void decreaseMoveCount() {
		this.moveCount--;
	}

	public Color getColor() {
		return color;
	}
}
