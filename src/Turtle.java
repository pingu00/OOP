public class Turtle {
    private int limbs = 4;
    protected String food;
    public void setFood(String f) { this.food = f; }
    public void eat() {
        System.out.println("Turtle eats " + food);
    }
    public int getLimbs(){
        return limbs;
    }
    void printLimbs(){
        System.out.println(limbs);
    }
}
