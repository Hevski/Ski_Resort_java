package SkiAreas;

import Interfaces.IReviewed;

public class BlueRun extends SkiRun implements IReviewed {

    private String colour;

    public BlueRun(String name, String ability, String colour, int rating) {
        super(name, ability, rating);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
