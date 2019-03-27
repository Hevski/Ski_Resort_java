package Interfaces;

import People.Person;
import People.Skier;

public interface ITicketed {

    public int defaultPrice(Person person);

    public double priceFor(Person person);

}
