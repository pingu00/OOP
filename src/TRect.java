public class TRect implements TIShape, Comparable{

    private double x1, y1, x2,y2 ;
    private double p;
    public TRect(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getP() {
        return p;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean intersects(Object o) {
        return false;
    }

    @Override
    public double area() {
        return Math.abs(x1 - x2) * Math.abs(y1 - y2) ;
    }

    @Override
    public double perimeter() {
        return 2*Math.abs(x1 - x2) + 2*Math.abs(y1 - y2);
    }

    @Override
    public void translate(int x, int y) {
        this.x1 += x;
        this.x2 += x;
        this.y1 += y;
        this.y2 += y;
    }

    public int compareTo(TRect r) {
        if(perimeter() > r.perimeter()) {
            return -1;
        }
        else if(perimeter() == r.perimeter()) {
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "(" + x1 +"," + y1 + ")" + "(" + x2 +"," + y2 + ")" + "p:" + perimeter();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}

