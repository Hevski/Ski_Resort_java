import RestAreas.KidsArea;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KidsAreaTest {

    KidsArea kidsArea;

    @Before
    public void before(){
        kidsArea = new KidsArea("Munchkins", "Penelope");
    }

    @Test
    public void canGetName(){
        assertEquals("Munchkins", kidsArea.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Penelope", kidsArea.getOwner());
    }
}
