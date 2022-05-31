import java.awt.Point;
public class Block2 {
    final Rectangle[] rectangles = new Rectangle[4];
    Point p1;

    Block2 (Point p){
        Rectangle[] rectangles = new Rectangle[4];
        for (int i=0; i<4; i++){
            rectangles[i] = new Rectangle(p.getLocation());
        }
        int W = Rectangle.WIDTH;
        int H = Rectangle.HEIGHT;
        rectangles[1].translate((int)p.getX() + W, (int)p.getY());
        rectangles[2].translate((int)p.getX() , (int)p.getY()+H);
        rectangles[3].translate((int)p.getX() + W, (int)p.getY()+H);
    }
    Block2 (int x, int y ){

        p1 = new Point(x,y);
        for (int i=0; i<4; i++) {
            rectangles[i] = new Rectangle(p1.getLocation());
        }
        int W = Rectangle.WIDTH;
        int H = Rectangle.HEIGHT;
        rectangles[1].translate(0,H);
        rectangles[2].translate(0,2*H);
        rectangles[3].translate( 0,3*W);
    }
    void translate ( int x, int y){
        for (int i=0; i<4; i++) {
            rectangles[i].translate(x,y);
        }

    }
    public String toString() {

        return rectangles[0].toString() + rectangles[1].toString() + rectangles[2].toString() + rectangles[3].toString();
    }
}
