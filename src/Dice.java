
public class Dice {
    private int number;
    void roll(){
       number = (int)Math.floor(Math.random()*6 +1);
    }
    int getNum(){
        return number;
    }
}
