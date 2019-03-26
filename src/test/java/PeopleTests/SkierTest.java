package PeopleTests;

import People.Skier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkierTest {

    Skier skier1;

    @Before
    public void before(){
        skier1 = new Skier("Heather", 25, "Super Advanced", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Heather", skier1.getName());
    }

    @Test
    public void canGetAge(){
        assertEquals(25, skier1.getAge());
    }

    @Test
    public void canGetSkiAbility(){
        assertEquals("Super Advanced", skier1.getAbility());
    }

    @Test
    public void canGetMoney(){
        assertEquals(100, skier1.getMoney());
    }
}
