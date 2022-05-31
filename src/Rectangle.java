import java.awt.Point;


public class Rectangle {
    static final int WIDTH = 50;
    static final int HEIGHT = 50;
    Point upperLeft;
    Point lowerRight;
    Rectangle(Point upperLeft){
        this.upperLeft = new Point(upperLeft);
        this.lowerRight = new Point((int)upperLeft.getX() + WIDTH, (int)upperLeft.getY() + HEIGHT);
    }
    Rectangle(Point upperLeft, Point lowerRight){
        this.upperLeft = new Point(upperLeft);
        this.lowerRight= new Point(lowerRight);
    }
    void translate(int x, int y){
        upperLeft.setLocation(upperLeft.getX() + x,upperLeft.getY() + y);
        lowerRight.setLocation(lowerRight.getX() + x,lowerRight.getY() + y);
    }
    public String toString() {
        return "UL:" + upperLeft +", RL:" + lowerRight+ "\n";
    }
}
