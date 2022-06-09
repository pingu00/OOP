public class SelectableRectangle extends Rectangle2{
    protected Point p1;
    protected boolean isSelected;
    public SelectableRectangle(Point p, double w, double h){
        super(h,w);
        p1= p;
        isSelected = false;
    }
    public void setSelected(boolean b){
        isSelected = b;
    }
    public boolean getSelected() {
        return isSelected;
    }
    public boolean isInside(Point p){
        int x = p.getX();
        int y = p.getY();
        int x1 = p1.getX();
        int y1 = p1.getY();
        if ((x1 <= x && x<= x1 + getWidth())&&(y1 <= y && y <= y1 + getHeight())){
            return true;
        }
        return false;
    }
}
