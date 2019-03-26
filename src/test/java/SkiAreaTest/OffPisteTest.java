package SkiAreaTest;

import SkiAreas.OffPiste;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OffPisteTest {

    OffPiste offPiste;

    @Before
    public void before(){
        offPiste = new OffPiste("Stairway To Heaven", "Super Advanced", 9, "High");
    }

    @Test
    public void canGetName(){
        assertEquals("Stairway To Heaven", offPiste.getName());
    }

    @Test
    public void canGetAbility(){
        assertEquals("Super Advanced", offPiste.getAbility());
    }

    @Test
    public void canGetAvalanchRisk(){
        assertEquals("High", offPiste.getAvalanchRisk());
    }

    @Test
    public void canSetAvalanchRisk(){
        offPiste.setAvalanchRisk("Medium");
        assertEquals("Medium", offPiste.getAvalanchRisk());
    }

    @Test
    public void getRating(){
        assertEquals(9, offPiste.getRating());
    }




}
