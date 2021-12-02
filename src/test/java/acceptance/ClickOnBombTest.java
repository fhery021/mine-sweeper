package acceptance;

import game.Game;
import game.GameBoard;
import game.GameStatus;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClickOnBombTest {

    @DisplayName("Given a board with bomb, when click on a bomb, you should loose")
    @Test
    void given_BoardWithBomb_when_play_loose() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.placeBomb();

        Game game = new Game(gameBoard);
        game.click();

        Assertions.assertThat(game.getStatus()).isEqualTo(GameStatus.LOST);
    }

    @DisplayName("Given a board without bomb, when click you should win")
    @Test
    void given_BoardWithoutBomb_when_play_WON() {
        GameBoard gameBoard = new GameBoard();

        Game game = new Game(gameBoard);
        game.click();

        Assertions.assertThat(game.getStatus()).isEqualTo(GameStatus.WON);
    }
}
