package SkiAreas;

public class BlueRun extends SkiRun {

    private String colour;

    public BlueRun(String name, String ability, String colour) {
        super(name, ability);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
