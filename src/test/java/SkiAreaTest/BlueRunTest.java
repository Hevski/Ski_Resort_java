package SkiAreaTest;

import SkiAreas.BlueRun;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BlueRunTest {

    BlueRun blueRun;

    @Before
    public void before(){
        blueRun = new BlueRun("slidey", "intermediate", "blue", 4);
    }

    @Test
    public void canGetName(){
        assertEquals("slidey", blueRun.getName());
    }

    @Test
    public void canGetAbility(){
        assertEquals("intermediate", blueRun.getAbility());
    }

    @Test
    public void getColour(){
        assertEquals("blue", blueRun.getColour());
    }

    @Test
    public void getRating(){
        assertEquals(4, blueRun.getRating());
    }
}
