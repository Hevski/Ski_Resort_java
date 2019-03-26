package SkiAreaTest;

import SkiAreas.GreenRun;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreenRunTest {

    GreenRun greenRun;

    @Before
    public void before(){
        greenRun = new GreenRun("cruise", "beginner", "green");
    }

    @Test
    public void canGetName(){
        assertEquals("cruise", greenRun.getName());
    }

    @Test
    public void canGetAbility(){
        assertEquals("beginner", greenRun.getAbility());
    }

    @Test
    public void getColour(){
        assertEquals("green", greenRun.getColour());
    }
}
