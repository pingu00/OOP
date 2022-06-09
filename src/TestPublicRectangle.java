public class TestPublicRectangle {
    public static void main(String[] args){
            Rectangle2 r = new Rectangle2(10.0,20.0);
            System.out.println(r.getWidth());
            System.out.println(r.getHeight());
            System.out.println(r.getArea());
            r.setHeight(20.0);
            System.out.println(r.getArea());
    }
}
