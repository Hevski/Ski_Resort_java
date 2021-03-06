package RestAreas;

import People.Person;
import People.Skier;
import RestAreas.KidsArea;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KidsAreaTest {

    KidsArea kidsArea;
    Skier skier1;
    Skier skier2;

    @Before
    public void before(){
        kidsArea = new KidsArea("Munchkins", "Penelope", 20, 10);
        skier1 = new Skier("Heather", 25, "Super Advanced", 100);
        skier1 = new Skier("Heather", 2, "Beginner", 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Munchkins", kidsArea.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals("Penelope", kidsArea.getOwner());
    }

    @Test
    public void canGetPrice(){
        assertEquals(20, kidsArea.defaultPrice(skier2));
    }

    @Test
    public void checkIfTooOld(){
        skier1 = new Skier("Tommy", 7, "Beginner", 0);
        assertEquals(false, kidsArea.isAllowed(skier1));
    }

    @Test
    public void ifNotBeginnerDoublePrice(){
        skier2 = new Skier("Tommy", 6, "Advanced", 80);
        assertEquals(40.00, kidsArea.priceFor(skier2),0);
    }

    @Test
    public void getRating(){
        assertEquals(10, kidsArea.getRating());
    }


}
