package SkiResortsTest;

import Interfaces.IReviewed;
import SkiAreas.BlackRun;
import SkiAreas.SkiRun;
import SkiResorts.SkiResort;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SkiResortTest {

    SkiResort skiResort;
    BlackRun blackRun;

    @Before
    public void before(){
        skiResort = new SkiResort("Verbier");
        blackRun = new BlackRun("Awesome", "More advanced", "Black", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Verbier", skiResort.getName());
    }

    @Test
    public void canAddReview(){
        skiResort.addReview(blackRun);
        assertEquals(1, skiResort.getAllReviews().size());
    }

    @Test
    public void canGetAllReviewed(){
        skiResort.addReview(blackRun);
        assertEquals(1, skiResort.getAllReviews().size());
    }
}
