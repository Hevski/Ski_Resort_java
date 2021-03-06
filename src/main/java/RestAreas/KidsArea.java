package RestAreas;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Interfaces.ITicketed;
import People.Person;
import People.Skier;

public class KidsArea extends RestArea implements ITicketed, ISecurity, IReviewed {

    private int price;

    public KidsArea(String name, String owner, int price, int rating) {
        super(name, owner, rating);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int defaultPrice(Person person) {
        return price;
    }

    public double priceFor(Person person) {
        if (!"Beginner".equals(((Skier) person).getAbility())){
            return this.price * 2;
        } else {
            return this.price;
        }
    }

    public boolean isAllowed(Person person) {
        if (person.getAge() > 6){
            return false;
        }
        else{
            return true;
        }

    }


}
