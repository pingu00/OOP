public class DicePlayer {
    String name;
    int dice1;
    int dice2;
    int diceSum = 0;
    DicePlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setDice(int dice1, int dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        diceSum = dice1 + dice2;
    }

}
