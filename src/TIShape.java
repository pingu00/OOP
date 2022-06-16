interface TIShape {

    boolean contains(double x, double y); //안에 포함하는지 판별

    boolean intersects(Object o); //교차하는지 판별

    double area(); //면적을 계산

    double perimeter(); //둘레를 계산

    void translate(int x, int y); //x,y만큼 이동

}