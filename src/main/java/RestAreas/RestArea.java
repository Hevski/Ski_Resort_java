package RestAreas;

import Interfaces.IReviewed;

public abstract class RestArea implements IReviewed {

    private String name;
    private String owner;
    private int rating;

    public RestArea(String name, String owner, int rating) {
        this.name = name;
        this.owner = owner;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getRating() {
        return rating;
    }
}
