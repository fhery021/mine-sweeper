package acceptance;

import game.Game;
import game.GameBoard;
import game.GameStatus;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClickOnBombTest {

    @DisplayName("Given a board with bomb, when click on a bomb, you should  loose")
    @Test
    void given_BoardWithBomb_when_click_loose() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.placeBomb(0);

        Game game = new Game();
        game.play();

        Assertions.assertThat(game.getStatus()).isEqualTo(GameStatus.LOST);
    }
}
