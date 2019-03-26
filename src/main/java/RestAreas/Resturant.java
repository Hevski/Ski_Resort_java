package RestAreas;

import Interfaces.IReviewed;
import RestAreas.RestArea;

public class Resturant extends RestArea implements IReviewed {

    public Resturant(String name, String owner, int rating) {
        super(name, owner, rating);
    }
}
