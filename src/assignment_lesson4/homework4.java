package assignment_lesson4;
class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle (int x, int y, int width, int height) {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    int square() {
        return (this.width*this.height);
    }

    void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Rectangle r=new Rectangle(2,2,8,7);
        Rectangle s=new Rectangle(5,5,6,6);
        Rectangle t=new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면적은 "+s.square());

    }

}
