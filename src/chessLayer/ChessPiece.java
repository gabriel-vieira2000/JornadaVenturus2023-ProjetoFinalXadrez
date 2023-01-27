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
	
	public void increaseMoveCount() {
		this.moveCount++;
	}
	
	public void decreaseMoveCount() {
		this.moveCount--;
	}

	public Color getColor() {
		return color;
	}
}
