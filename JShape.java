import java.awt.Color;
/**
 * J-Shape piece in the Tetris Game.
 */
public class JShape extends AbstractPiece{
	/**
	 * Creates an J-Shape piece.
	 * @param r row location for this piece
	 * @param c column location for this piece
	 * @param g the grid for this game piece
	 */
	public JShape(int r, int c, Grid g) {  
            super(r, c, g);
		// Create the squares
		square[0] = new Square(g, r - 1, c, Color.BLUE, true);
		square[1] = new Square(g, r, c, Color.BLUE, true);
		square[2] = new Square(g, r + 1, c, Color.BLUE, true);
		square[3] = new Square(g, r + 1, c - 1, Color.BLUE, true);
	}     
}