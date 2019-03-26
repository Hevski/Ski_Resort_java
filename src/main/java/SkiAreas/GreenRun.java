package SkiAreas;

public class GreenRun extends SkiRun {

    private String colour;

    public GreenRun(String name, String ability, String colour) {
        super(name, ability);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
