package RestAreas;

import Interfaces.ISecurity;
import People.Person;

public class ApresSki extends RestArea implements ISecurity {

    public ApresSki(String name, String owner) {
        super(name, owner);
    }

    public boolean isAllowed(Person person){
        if (person.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }
}
