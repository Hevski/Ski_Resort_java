import People.Skier;
import RestAreas.ApresSki;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApresSkiTest {

    ApresSki apresSki;
    Skier skier1;
    Skier skier2;

    @Before
    public void before(){
        apresSki = new ApresSki("Pub Mont Fort", "Yannik");
        skier1 = new Skier("Heather", 25, "Super Advanced", 100);
        skier2 = new Skier("Chester", 12, "Beginner", 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Pub Mont Fort", apresSki.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Yannik", apresSki.getOwner());
    }

    @Test
    public void checkIfOldEnough__oldEnough(){
        assertEquals(true, apresSki.isAllowed(skier1));
    }

    @Test
    public void checkIfOldEnough__notOldEnough(){
        assertEquals(false, apresSki.isAllowed(skier2));
    }
}
