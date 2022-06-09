public class Selection {
    public void select(SelectableRectangle r, Point p){
        if (r.isInside(p)){
            r.setSelected(true);
        }
        else r.setSelected(false);
    }
}
