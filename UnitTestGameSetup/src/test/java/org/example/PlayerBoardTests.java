package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerBoardTests {

    @Test
    public void testApplyWinnings(){
        PlayerBoard playerBoard = new PlayerBoard();
        playerBoard.applyWinner(3, 20);
        playerBoard.applyWinner(1, 10);
        assertEquals(20, playerBoard.getPlayer(1));
        assertEquals(10, playerBoard.getPlayer(2));
        assertEquals(30, playerBoard.getPlayer(3));
        assertEquals(10, playerBoard.getPlayer(4));
    }

    @Test
    public void testApplyWinningsV2(){
        PlayerBoard playerBoard = new PlayerBoard();
        playerBoard.applyWinner(2, 0);
        playerBoard.applyWinner(4, -40);
        playerBoard.applyWinner(1, 100);
        assertEquals(110, playerBoard.getPlayer(1));
        assertEquals(10, playerBoard.getPlayer(2));
        assertEquals(10, playerBoard.getPlayer(3));
        assertEquals(0, playerBoard.getPlayer(4));
    }
}
