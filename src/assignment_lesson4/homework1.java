package assignment_lesson4;

class TV {
    private String corporation;  //제품 회사
    private int year; //년형
    private int inch; //인치

    TV (String corporation, int year, int inch) {
        this.corporation=corporation;
        this.year=year;
        this.inch=inch;
    }
    void show() {
        System.out.println(corporation+"에서 만든 "+year+"년형 "+inch+"인치 TV");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TV myTV=new TV("LG",2017,32);
        myTV.show();
    }

}