import java.awt.Color;
/**
 * Z-Shape piece in the Tetris Game.
 */
public class ZShape extends AbstractPiece{
	/**
	 * Creates an Z-Shape piece.
	 * @param r row location for this piece
	 * @param c column location for this piece
	 * @param g the grid for this game piece
	 */
	public ZShape(int r, int c, Grid g) {  
            super(r, c, g);
		// Create the squares
		square[0] = new Square(g, r, c - 1, Color.RED, true);
		square[1] = new Square(g, r, c, Color.RED, true);
		square[2] = new Square(g, r + 1, c, Color.RED, true);
		square[3] = new Square(g, r + 1, c + 1, Color.RED, true);
	}    
}
