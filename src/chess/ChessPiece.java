package chess;

import chessgame.boardGame.Board;
import chessgame.boardGame.Piece;

public class ChessPiece extends Piece {
	private Color color;
	
	public ChessPiece(int position, Board board) {
		super(position, board);
	}

	public Color getColor() {
		return color;
	}

	
}
