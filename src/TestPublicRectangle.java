public class TestPublicRectangle {
    public static void main(String[] args){
            Retangle r = new Retangle(10.0,20.0);
            System.out.println(r.getWidth());
            System.out.println(r.getHeight());
            System.out.println(r.getArea());
            r.setHeight(20.0);
            System.out.println(r.getArea());
    }
}
