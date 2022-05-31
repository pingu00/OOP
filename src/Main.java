//201810766 kimpilgyu
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        //(1) solution
        Scanner sc = new Scanner(System.in);
        System.out.print("PREMIUM or REGULAR ?:  ");
        String pok = sc.next();
        double ep = 1;
        if (pok.equals("PREMIUM")){
            ep = PremiumOK.PREMIUM.getExtraPoint();
        }
        else {
            ep = PremiumOK.REGULAR.getExtraPoint();
        }
        System.out.print("total round: ");
        int count = sc.nextInt();
        System.out.printf("Entered %d rounds with %s \n",count, pok);
        System.out.print("\n");

        //(2) solution
        Dice Dtest = new Dice();
        Yut Ytest = new Yut();
        int Dsum = 0;
        int Ysum = 0;
        for(int i=0; i<2;i++){
            for(int j=0; j<10;j++){
                Dtest.roll();
                Ytest.roll();
                System.out.printf("[_%d]...rolled dice:  %d yut:  %d\n",j,Dtest.getNum(),Ytest.getNum());
                Dsum += Dtest.getNum();
                Ysum += Ytest.getNum();
            }
            System.out.printf("[%d][SUM] dice: %d yut: %d -> %.2f\n",i,Dsum,Ysum,Ysum*ep);
            System.out.print("\n");
        }

        //(3) solution
        DiceProbability dice = new DiceProbability(count,ep);
        dice.Diceroll();
        dice.calcProbability();
        dice.printProbability();
        System.out.print("\n");

        //(4) solution
        DiceProbability yut = new DiceProbability(count,ep);
        yut.Yutroll();
        yut.calcProbability();
        yut.printProbability();

        //(5) solution
        DiceProbability w = new DiceProbability(count,ep);
        System.out.printf("Total round: %d applying %s %.2f",count,pok,ep);
        w.printWinLoseOfDice();

        //(6) solution
        for (int i =0; i<10 ; i++){

        }
    }
}
