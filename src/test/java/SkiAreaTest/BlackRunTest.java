package SkiAreaTest;

import SkiAreas.BlackRun;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlackRunTest {

    BlackRun blackRun;

    @Before
    public void before(){
        blackRun = new BlackRun("Awesome", "More advanced", "Black", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Awesome", blackRun.getName());
    }

    @Test
    public void canGetAbility(){
        assertEquals("More advanced", blackRun.getAbility());
    }

    @Test
    public void getColour(){
        assertEquals("Black", blackRun.getColour());
    }

    @Test
    public void getRating(){
        assertEquals(5, blackRun.getRating());
    }


}
