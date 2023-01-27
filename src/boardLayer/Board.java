package boardLayer;

import chessLayer.ChessPiece;

public class Board {
	private int rows;
	private int columns;
	private ChessPiece[][] pieces;
	
	
	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.pieces = new ChessPiece[rows][columns];
	}
	
	public void placePiece(ChessPiece piece, Position position) {
		if(!positionExists(position)) {
			new BoardException("The position chosed is invalid! Please, choose another!");
		}
		else if(thereIsAPiece(position) && piece != null) {
			new BoardException("In this position chosed has a piece! Please, choose another!");
		}
		else{
			System.out.println(piece);
			if(piece != null) this.pieces[position.getRow()][position.getColumn()] = piece;
			else this.pieces[position.getRow()][position.getColumn()] = null;
			System.out.println(this.pieces[position.getRow()][position.getColumn()]);
		}
	}
	
	public boolean positionExists(Position position) {
		if(position.getRow() >= this.rows || position.getRow() < 0 || position.getColumn() >= this.columns || position.getColumn() < 0) return false;
		else return true;
	}
	
	public boolean thereIsAPiece(Position position) {
		if(this.pieces[position.getRow()][position.getColumn()] != null) return true;
		else return false;
	}
	
	public ChessPiece piece(int row, int column) {
		return this.pieces[row][column];
	}
	
	public ChessPiece piece(Position position) {
		return this.pieces[position.getRow()][position.getColumn()];
	}
	

	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}
}
