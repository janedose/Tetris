import java.awt.Color;
/**
 * S-Shape piece in the Tetris Game.
 */
public class SShape extends AbstractPiece{
	/**
	 * Creates an S-Shape piece.
	 * @param r row location for this piece
	 * @param c column location for this piece
	 * @param g the grid for this game piece
	 */
	public SShape(int r, int c, Grid g) {  
            super(r, c, g);
		// Create the squares
		square[0] = new Square(g, r, c + 1, Color.GREEN, true);
		square[1] = new Square(g, r, c, Color.GREEN, true);
		square[2] = new Square(g, r + 1, c, Color.GREEN, true);
		square[3] = new Square(g, r + 1, c - 1, Color.GREEN, true);
	}    
}
