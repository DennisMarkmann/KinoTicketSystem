package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.kasse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ObeserverTest
{

    @Test
    public void testteInformiereUeberAenderung()
    {

        Beobachtbar beobachtbar = new Beobachtbar();
        Beobachter beobachter = new Beobachter();

        beobachtbar.addObserver(beobachter);
        beobachtbar.update();
        beobachtbar.update();
        assertEquals(2, beobachter.getNumberOfCalls());

    }

}
