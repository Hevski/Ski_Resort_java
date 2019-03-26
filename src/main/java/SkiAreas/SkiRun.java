package SkiAreas ;

import Interfaces.IReviewed;

public abstract class SkiRun implements IReviewed {

    private String name;
    private String ability;
    private int rating;

    public SkiRun(String name, String ability, int rating) {
        this.name = name;
        this.ability = ability;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }

    public int getRating() {
        return rating;
    }


}
