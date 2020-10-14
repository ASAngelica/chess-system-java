package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //O Java j� considera null mas foi colocado s� para enfatizar didaticamente
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
	
	
 
}
