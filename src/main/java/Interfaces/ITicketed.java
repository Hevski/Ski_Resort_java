package Interfaces;

import People.Skier;

public interface ITicketed {

    public int defaultPrice(Skier skier);

    public double priceFor(Skier skier);

}
