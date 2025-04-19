public class Main {
    public static void main(String[] args) {
        // Using Football gameplay strategy
        GameplayStrategy footballStrategy = new FootballGameplayStrategy();
        Game footballGame = new Game(footballStrategy);
        footballGame.play();

        System.out.println();

        // Using Basketball gameplay strategy
        GameplayStrategy basketballStrategy = new BasketballGameplayStrategy();
        Game basketballGame = new Game(basketballStrategy);
        basketballGame.play();
    }
}