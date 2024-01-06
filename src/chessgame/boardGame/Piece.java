package chessgame.boardGame;

public class Piece {
	protected int position;
	private Board board;
	
	public Piece(int position, Board board) {
		this.position = position;
		this.board = null;
	}

	protected Board getBoard() {
		return board;
	}

	
	
}
