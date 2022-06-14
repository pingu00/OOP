public class ACircle extends AbstractShape{
    private double r;
    public ACircle(double r){
        this.r = r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
    public double getParameter() {return 0.0;}
}
