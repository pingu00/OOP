//201810766 kimpilgyu
public class Dice {
    int n;
    void roll(){
       n = (int)Math.floor(Math.random()*6 +1);
    }
    int getNum(){
        return n;
    }
}
