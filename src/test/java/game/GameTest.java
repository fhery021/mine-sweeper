package game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameTest {

    @DisplayName("Given a new Game, status should be IN_PROGRESS")
    @Test
    void given_NewGame_when_getStatus_shouldReturn_InProgress() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.placeBomb();
        Game game = new Game(gameBoard);

        Assertions.assertThat(game.getStatus()).isEqualTo(GameStatus.IN_PROGRESS);
    }

    @DisplayName("Given a new Game with no bombs, when playing it, status should be WON")
    @Test
    void given_NewGameWithNoBombs_getStatus_shouldReturn_WON() {
        GameBoard gameBoard = new GameBoard();
        Game game = new Game(gameBoard);
        game.click();

        Assertions.assertThat(game.getStatus()).isEqualTo(GameStatus.WON);
    }

    @DisplayName("Given a new Game, when clicking on a bomb, status should be LOST")
    @Test
    void given_NewGameWithBombs_when_clickOnBomb_getStatus_shouldReturn_LOST() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.placeBomb();
        Game game = new Game(gameBoard);
        game.click();

        Assertions.assertThat(game.getStatus()).isEqualTo(GameStatus.LOST);
    }

}
