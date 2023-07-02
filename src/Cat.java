public class Cat extends Animal {
    private int lives;

    public int getLives(){
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decreaseOfLives(){
        this.lives--;
    }

}
