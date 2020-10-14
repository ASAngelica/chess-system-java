package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //O Java já considera null mas foi colocado só para enfatizar didaticamente
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
	
	
 
}
