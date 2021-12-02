package game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardTest {

    @DisplayName("Given a new Game Board, the board should not contain bomb")
    @Test
    void given_NewGameBoard_when_placeBomb_should_containBomb() {
        GameBoard gameBoard = new GameBoard();
        gameBoard.placeBomb();
        char expectedContent = 'X';

        Assertions.assertThat(gameBoard.getContent()).isEqualTo(expectedContent);
    }

    @DisplayName("Given a new Game Board, when placing a bomb, the board will contain the bomb in the correct position")
    @Test
    void given_NewGameBoard_shouldNot_containBomb() {
        GameBoard gameBoard = new GameBoard();

        Assertions.assertThat(gameBoard.getContent()).isEqualTo('_');
    }

}
