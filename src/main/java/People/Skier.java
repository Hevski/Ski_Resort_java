package People;


public class Skier extends Person {

    private String ability;
    private int money;

    public Skier(String name, int age, String ability, int money) {
        super(name, age);
        this.ability = ability;
        this.money = money;
    }

    public String getAbility() {
        return ability;
    }

    public int getMoney() {
        return money;
    }


}
