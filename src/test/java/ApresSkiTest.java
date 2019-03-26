import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApresSkiTest {

    ApresSki apresSki;

    @Before
    public void before(){
        apresSki = new ApresSki("Pub Mont Fort", "Yannik");
    }

    @Test
    public void canGetName(){
        assertEquals("Pub Mont Fort", apresSki.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Yannik", apresSki.getOwner());
    }
}
