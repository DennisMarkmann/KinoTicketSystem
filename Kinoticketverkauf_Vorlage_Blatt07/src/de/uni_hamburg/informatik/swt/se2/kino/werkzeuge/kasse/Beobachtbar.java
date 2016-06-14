package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.kasse;

import java.util.Observable;

public class Beobachtbar extends Observable
{

    void update()
    {
        super.setChanged();
        super.notifyObservers();
    }
}
