import static org.junit.Assert.*;
import org.junit.Test;


public class ScissorsPaperTest {
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", ScissorsPaper.rps("rock", "scissors"));
        assertEquals("Player 1 won!", ScissorsPaper.rps("scissors", "paper"));
        assertEquals("Player 1 won!", ScissorsPaper.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", ScissorsPaper.rps("scissors", "rock"));
        assertEquals("Player 2 won!", ScissorsPaper.rps("paper", "scissors"));
        assertEquals("Player 2 won!", ScissorsPaper.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", ScissorsPaper.rps("scissors", "scissors"));
        assertEquals("Draw!", ScissorsPaper.rps("paper", "paper"));
        assertEquals("Draw!", ScissorsPaper.rps("rock", "rock"));
    }
}
