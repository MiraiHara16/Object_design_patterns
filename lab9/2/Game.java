public class Game {
    private GameplayStrategy gameplayStrategy;

    public Game(GameplayStrategy gameplayStrategy) {
        this.gameplayStrategy = gameplayStrategy;
    }

    public void play() {
        gameplayStrategy.initializeGame();
        gameplayStrategy.playingGame();
        gameplayStrategy.showResult();
    }
}