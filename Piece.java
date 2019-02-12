import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * Piece Interface to be implemented by different game pieces
 */
public interface Piece {
    void draw(Graphics g);
    void move(Direction direction);
    Point[] getLocations();
    Color getColor();
    boolean canMove(Direction direction);  
    void rotate();
}
