package game;

public class GameBoard {

    private char content = '_';

    public void placeBomb() {
        content = 'X';
    }

    public char getContent() {
        return content;
    }
}
