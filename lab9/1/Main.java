public class Main {
    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        footballGame.play();

        System.out.println();

        Game basketballGame = new BasketballGame();
        basketballGame.play();
    }
}