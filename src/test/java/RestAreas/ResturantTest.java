package RestAreas;

import RestAreas.Resturant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResturantTest {

    Resturant resturant;

    @Before
    public void before(){
        resturant = new Resturant("Pit Stop", "Robert", 6);
    }

    @Test
    public void canGetName(){
        assertEquals("Pit Stop", resturant.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Robert", resturant.getOwner());
    }

    @Test
    public void getRating(){
        assertEquals(6, resturant.getRating());
    }
}
