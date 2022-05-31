//201810766 kimpilgyu
public class DiceProbability {
    int n;
    int[] a ;
    double[] b;
    int[] t = new int[6]; // Dice count storage
    double ep;
    public DiceProbability(int n, double ep){
        int[] a = new int[n];
        double[] b = new double[6];
        this.n = n;
        this.a = a;
        this.b = b;
        this.ep = ep;
    }

    void Diceroll(){
        Dice d1 = new Dice();
         for ( int i = 0 ; i < n ; i++){
             d1.roll();
             a[i] = d1.getNum();
         }
    }
    void Yutroll(){
        Yut y1 = new Yut();
        for ( int i = 0 ; i < n ; i++){
            y1.roll();
            a[i] = y1.getNum();
        }
    }
     void calcProbability(){

         for ( int i =0 ; i<n ; i++){
             t[a[i]-1]++; // if a[i] is number 1, value of temp[0] plus 1
         }
         for(int i = 0; i<6 ; i++) {
             b[i] = (double) t[i] / n;
         }
    }
    void printProbability() {
        for (int i = 1; i <= 6; i++) {
            System.out.printf("Dice %d: %d Probability: %1.3f \n", i, t[i - 1], b[i - 1]*10);// The sum of the probabilities of a given problem is 10
        }

    }
    void printWinLoseOfDice(){
        Dice Dtest = new Dice();
        Yut Ytest = new Yut();
        int Dsum = 0;
        int Ysum = 0;
        int win=0;
        int lose =0;
        int draw = 0 ;
        for(int i=0; i<n;i++){
            for(int j=0; j<10;j++){
                Dtest.roll();
                Ytest.roll();
                Dsum += Dtest.getNum();
                Ysum += Ytest.getNum();
            }
            if (Dsum > Ysum*ep){
                win ++;
            }
            else if(Dsum < Ysum*ep){
                lose ++;
            }
            else {draw++;}
        }
        System.out.printf("[WINLOSE] feqWin1:  %d freqDraw1:  %d freqLose1:  %d",win,lose,draw);
    }

}
