package SkiAreas;

public abstract class SkiRun {

    private String name;
    private String ability;

    public SkiRun(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }
}
