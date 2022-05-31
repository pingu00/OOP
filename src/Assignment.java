import java.util.Scanner;

public class Assignment {
        public static void main(String[] args) {

            String stringData = "Let's meet in my office at 10";


            System.out.println("원본 문장: "+stringData);
            System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if (!stringData.contains(s)){
                    System.out.println("잘못된 문자열 입니다.");
                    return;
            }

            System.out.println("새로운 문자열을 입력하세요: ");
            String newone = sc.next();
            stringData = stringData.replace(s,newone);
            System.out.println("새로운 문장: "+ stringData);

        }
}
