import java.awt.Color;
/**
 * Square-Shape piece in the Tetris Game.
 */
public class SquareShape extends AbstractPiece{
	/**
	 * Creates an Square-Shape piece.
	 * @param r row location for this piece
	 * @param c column location for this piece
	 * @param g the grid for this game piece
	 */
	public SquareShape(int r, int c, Grid g) {  
            super(r, c, g);
		// Create the squares
		square[0] = new Square(g, r, c - 1, Color.GRAY, true);
		square[1] = new Square(g, r, c, Color.GRAY, true);
		square[2] = new Square(g, r + 1, c - 1, Color.GRAY, true);
		square[3] = new Square(g, r + 1, c, Color.GRAY, true);
	}
        @Override
    public void rotate(){
    }
}
