package boardLayer;

public class Piece {
	protected Position position;
	protected Board board;
	
	public Piece(Board board) {
		super();
		this.board = board;
	}

	public boolean[][] possibleMoves(){
		return new boolean[8][8];
	}
	
	public boolean possibleMove(Position position) {
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		return false;
	}

	protected Board getBoard() {
		return board;
	}
}
