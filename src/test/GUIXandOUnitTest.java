package test;

import main.GUI_XandO;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class GUIXandOUnitTest {
    private GUI_XandO x_and_o;

    @Before
    public void init() {
        x_and_o = new GUI_XandO();
    }

    @Test
    public void testIsDraw() {
        // completely filled, with no winner : draw
        x_and_o.buttons[0].setText("X");
        x_and_o.buttons[1].setText("O");
        x_and_o.buttons[2].setText("X");
        x_and_o.buttons[3].setText("X");
        x_and_o.buttons[4].setText("O");
        x_and_o.buttons[5].setText("O");
        x_and_o.buttons[6].setText("O");
        x_and_o.buttons[7].setText("X");
        x_and_o.buttons[8].setText("X");

        boolean result = x_and_o.isDraw();
        assertTrue(result);
    }

    @Test
    public void testCheckWinXWins() {
        // where X wins
        x_and_o.buttons[0].setText("X");
        x_and_o.buttons[1].setText("X");
        x_and_o.buttons[2].setText("X");

        x_and_o.checkWin();

        // check if game recognizes X as winner
        boolean xWins = x_and_o.buttons[0].getBackground().equals(new Color(23, 230, 0));
        assertTrue(xWins);
    }
    @Test
    public void testCheckWinOWins() {
        // O wins the game
        x_and_o.buttons[0].setText("O");
        x_and_o.buttons[1].setText("O");
        x_and_o.buttons[2].setText("O");

        x_and_o.checkWin();

        // check if game recognizes O as winner
        boolean oWins = x_and_o.buttons[0].getBackground().equals(Color.GREEN);
        assertTrue(oWins);
    }

}
