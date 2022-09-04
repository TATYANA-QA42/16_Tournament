package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GameTest {
    Game game = new Game();
    Player player1 = new Player(4, "Roma", 390);
    Player player2 = new Player(8, "blok", 230);
    Player player3 = new Player(9, "smev", 390);
    Player player4 = new Player(11, "grey", 500);

    @BeforeEach
    public void reg() {

        //       Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
    }

    @Test
    public void testWinFirst() {
        int expected = 1;
        int actual = game.round("Roma", "blok");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDraw() {
        int expected = 0;
        int actual = game.round("Roma", "smev");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWinSecond() {
        int expected = 2;
        int actual = game.round("blok", "smev");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNotRegisteredSecond() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("blok", "grey");
        });
    }

    @Test
    public void testNotRegisteredFirst() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("grey", "blok");
        });

    }
}
