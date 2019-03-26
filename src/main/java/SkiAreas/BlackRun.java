package SkiAreas;

public class BlackRun extends SkiRun {

    private String colour;

    public BlackRun(String name, String ability, String colour) {
        super(name, ability);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
