package core.basesyntax;

public class Application {
    private static final int BALLS_CAPACITY = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[BALLS_CAPACITY];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery().getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
