public class TCircle  implements TIShape, Comparable {
    private double x,y;
    private double radius;
    public TCircle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }


    public boolean contains(double x, double y) {
        double dist = Math.abs(this.x - x) + Math.abs(this.y - y);
        if (dist < radius) {
            return true;
        }
        else return false;
    } //안에 포함하는지 판별



    public boolean intersects(TCircle c){
        double distPts = Math.sqrt ((this.x - c.x) * (this.x - c.x) + (this.y - c.y) * (this.y - c.y));
        double sumR = radius + c.radius;
        if (distPts > sumR) {
            return false;
        }
        else return true;
    } //교차하는지 판별

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI * radius;
    }

    @Override
    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }


    public int compareTo(TCircle c) {
        if(perimeter() > c.perimeter()) {
            return 1;
        }
        else if(perimeter() == c.perimeter()) {
            return 0;
        }
        else {
            return -1;
        }
    }

    public String toString() {
        return "(" + getX() +"," + getY() + ")" + "~" + getRadius() + "p:" + perimeter();
    }

    @Override
    public boolean intersects(Object o) {
        return false;
    }
    public int compareTo(Object o) {
        return 0;
    }
}
