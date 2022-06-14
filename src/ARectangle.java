public class ARectangle extends AbstractShape {
    private final double w,h;
    public ARectangle(double w, double h){
        this.w = w;
        this.h = h;
    }
    public double getArea() {return w*h;}
    public double getParameter() {return 0.0;}
}
