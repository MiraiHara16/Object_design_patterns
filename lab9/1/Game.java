public abstract class Game {
    abstract void initializeGame();
    abstract void playingGame();
    abstract void showResult();

    // Template method
    public final void play() {
        initializeGame();
        playingGame();
        showResult();
    }
}