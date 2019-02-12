import java.awt.Color;
/**
 * Bar-Shape piece in the Tetris Game.
 */
public class BarShape extends AbstractPiece{
	/**
	 * Creates an Bar-Shape piece.
	 * @param r row location for this piece
	 * @param c column location for this piece
	 * @param g the grid for this game piece
	 */
	public BarShape(int r, int c, Grid g) {  
            super(r, c, g);
		// Create the squares
		square[0] = new Square(g, r, c - 1, Color.cyan, true);
		square[1] = new Square(g, r, c, Color.cyan, true);
		square[2] = new Square(g, r, c + 1, Color.cyan, true);
		square[3] = new Square(g, r, c + 2, Color.cyan, true);
	}     
}
