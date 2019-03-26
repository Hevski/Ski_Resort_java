package SkiAreas;

public class RedRun extends SkiRun {

    private String colour;

    public RedRun(String name, String ability, String colour) {
        super(name, ability);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
