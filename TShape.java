import java.awt.Color;
/**
 * T-Shape piece in the Tetris Game.
 */
public class TShape extends AbstractPiece{
	/**
	 * Creates an T-Shape piece.
	 * @param r row location for this piece
	 * @param c column location for this piece
	 * @param g the grid for this game piece
	 */
	public TShape(int r, int c, Grid g) {  
            super(r, c, g);
		// Create the squares
		square[0] = new Square(g, r, c - 1, Color.YELLOW, true);
		square[1] = new Square(g, r, c, Color.YELLOW, true);
		square[2] = new Square(g, r, c + 1, Color.YELLOW, true);
		square[3] = new Square(g, r + 1, c, Color.YELLOW, true);
	}     
}