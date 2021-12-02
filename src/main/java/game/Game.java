package game;

public class Game {

    private GameBoard gameBoard;
    private GameStatus status;

    public Game(GameBoard gameBoard) {
        this.status = GameStatus.IN_PROGRESS;
        this.gameBoard = gameBoard;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void click() {
        status = gameBoard.getContent() == 'X' ? GameStatus.LOST : GameStatus.WON;
    }
}
