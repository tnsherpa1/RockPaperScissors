package test;
import com.tashi.Menu;
import com.tashi.Player;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.tashi.Game;

public class GameTest {

    @Test
    public void testIfNumIsRandom(){
        int randomNum = Player.randomChoice();
        assertTrue(randomNum>0 && randomNum < 4);
    }

}


