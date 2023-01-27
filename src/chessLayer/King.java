package chessLayer;

import boardLayer.Board;
import boardLayer.Position;

public class King extends ChessPiece {
	
	public King(Board board, Color color) {
		super(board,color);
	}
	
	public boolean[][] posssibleMoves(Position position) {
		boolean[][] possibleMoves = new boolean[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows();i++) {
			for(int j=0; j<board.getColumns();j++) {
				possibleMoves[i][j] = false;
			}
		}
		
		return possibleMoves;
	}
	
	@Override
	public String toString() {
		return "K";
	}
}
