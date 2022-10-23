
import java.util.Scanner;

public class DiceGameMain {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("게임 참가자수를 입력하시오: ");
        int num = sc.nextInt();
        DicePlayer[] dp = new DicePlayer[num];
        int[] winnerArray = new int[num];
        System.out.println("참가자의 이름을 입력하시오");
        sc.nextLine();
        for(int i=0; i < num ; i ++ ){
            System.out.println(i+"번 참가자 이름 입력 :");
            dp[i] = new DicePlayer(sc.nextLine());
            winnerArray[i] = 0; // 초기화

        }
        System.out.println("***지금부터 게임을 시작합니다.***");
        int round = 1;

        while (true) {

            System.out.println("Game #"+round);
            DiceGame dg1 = new DiceGame(num,dp);
            winnerArray[dg1.play(num,dp)]++;
            System.out.println("게임을 계속하시겠습니까?(y/n)");
            String check = sc.next();
            if (check.equals("y")) {
                round++;
            }
            else if (check.equals("n")) {
                System.out.println("게임을 종료하겠습니다.");
                break;
            }
            else {
                System.out.println("잘못누르셨습니다.");
                break;
            }

        }
        System.out.println("전체 " + round + " 게임 중");
        for (int i =0; i<num; i++){
            System.out.print(dp[i].name +":" + winnerArray[i]+"승    ");
        }
        System.out.print("하였습니다.");

    }
}
