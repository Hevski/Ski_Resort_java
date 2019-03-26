package RestAreas;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import People.Person;
import People.Skier;

public class KidsArea extends RestArea implements ITicketed, ISecurity {

    private int price;

    public KidsArea(String name, String owner, int price) {
        super(name, owner);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public double priceFor(Skier skier) {
        if (!"Beginner".equals(skier.getAbility())){
            return this.price * 2;
        } else {
            return this.price;
        }
    }

//    public int defaultPrice(Person person) {
//        return this.price;
//    }

    public boolean isAllowed(Person person) {
        if (person.getAge() > 6){
            return false;
        }
        else{
            return true;
        }

    }


}
