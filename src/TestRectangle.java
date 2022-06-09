public class TestRectangle {
    public static void main(String []args){

        SelectableRectangle r = new SelectableRectangle(new Point(100,100),30,20);
        Selection s = new Selection();
        Point p1 = new Point(110,110);
        s.select(r,p1);
        System.out.println(r.isInside(p1));
    }
}
