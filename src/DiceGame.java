import java.util.Scanner;

public class DiceGame {
    int num = 0;
    DicePlayer[] dp;
    Scanner sc = new Scanner(System.in);

    DiceGame(int num, DicePlayer[] dp){
        this.num = num;
        this.dp = dp;
    }
    int play(int num, DicePlayer[] dp) { // 게임 부분을 함수로 만들까 하고 있었음.
        for(int i=0; i<num; i++){
                    System.out.println(dp[i].getName()+" 차례입니다.주사위를 던지려면 1 을 눌러주세요:" );
                    int check = sc.nextInt();
                    if (check == 1 ){
                        Dice die1 = new Dice();
                        Dice die2 = new Dice();
                        die1.roll();
                        die2.roll();
                    dp[i].setDice(die1.getNum(),die2.getNum());
                    System.out.println(dp[i].getName() + ": 첫번째 주사위 "+ dp[i].dice1 + ", 두번째 주사위 "+ dp[i].dice2 + ", 두 주사위의 합: "+ dp[i].diceSum  );

                    }
                    else {
                        break;
                    }

            }
            int winnerIndex = 0;
            for(int i=0; i<num; i++){

                int max = 0;
                if (dp[i].diceSum > max ){
                    max = dp[i].diceSum;
                    winnerIndex = i;
                }

            }
            System.out.println("이번게임의 승자는 " + dp[winnerIndex].getName() +" 입니다." );
            return winnerIndex;
        }
}