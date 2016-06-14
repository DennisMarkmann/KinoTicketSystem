package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.kasse;

import java.util.Observable;
import java.util.Observer;

public class Beobachter implements Observer
{
    private int numberOfCalls = 0;

    public int getNumberOfCalls()
    {
        return numberOfCalls;
    }

    public void setNumberOfCalls(int numberOfCalls)
    {
        this.numberOfCalls = numberOfCalls;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        setNumberOfCalls(getNumberOfCalls() + 1);
    }
}
