public class TestAbstract {
    public static void main(String []args){
        AbstractShape[] shapes = new AbstractShape[2];
        shapes [0] = new ARectangle(100,90);
        shapes [1] = new ACircle(50);
        for (AbstractShape shape: shapes){
            if (shape instanceof ARectangle) {
                ARectangle ar = (ARectangle) shape;
                System.out.println(ar.getArea());
            }
            else if (shape instanceof ACircle ) {
                ACircle ar = (ACircle) shape;
                System.out.println(ar.getArea());
            }
        }
    }
}
