package SkiAreaTest;

import SkiAreas.RedRun;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedRunTest {

    RedRun redRun;

    @Before
    public void before(){
        redRun = new RedRun("pretty good", "advanced", "red", 8);
    }

    @Test
    public void canGetName(){
        assertEquals("pretty good", redRun.getName());
    }

    @Test
    public void canGetAbility(){
        assertEquals("advanced", redRun.getAbility());
    }

    @Test
    public void getColour(){
        assertEquals("red", redRun.getColour());
    }

    @Test
    public void getRating(){
        assertEquals(8, redRun.getRating());
    }
}
