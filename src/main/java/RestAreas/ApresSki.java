package RestAreas;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import People.Person;

public class ApresSki extends RestArea implements ISecurity, IReviewed {

    public ApresSki(String name, String owner, int rating) {
        super(name, owner, rating);
    }

    public boolean isAllowed(Person person){
        if (person.getAge() < 18){
            return false;
        } else {
            return true;
        }
    }
}
