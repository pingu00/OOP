public class Rectangle2 {
    private double height;
    private double width;
    private double area;
    public Rectangle2(double h, double w) {
        height = h;
        width = w;
        calcArea();
    }

    public double getHeight() {
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return area;
    }
    public void setHeight(double height) {
        this.height = height;
        calcArea();
    }
    void calcArea(){
        area = height * width;
    }
}
