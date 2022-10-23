package assignment_lesson4;

import java.util.Scanner;

class Grade {
    private int math;
    private int science;
    private int english;

    Grade(int math,int science,int english) {
        this.math=math;
        this.science=science;
        this.english=english;
    }

    int average() {
        int sum=this.math+this.science+this.english;
        return (int)(sum/3);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan=new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math=scan.nextInt();
        int science=scan.nextInt();
        int english=scan.nextInt();
        Grade me=new Grade(math,science,english);
        System.out.println("평균은 "+me.average());

        scan.close();
    }

}
