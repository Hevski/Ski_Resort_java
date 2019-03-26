package SkiAreas;

public class OffPiste extends SkiRun {

    private String avalanchRisk;

    public OffPiste(String name, String ability, String avalanchRisk) {
        super(name, ability);
        this.avalanchRisk = avalanchRisk;
    }

    public String getAvalanchRisk() {
        return avalanchRisk;
    }

    public void setAvalanchRisk(String avalanchRisk) {
        this.avalanchRisk = avalanchRisk;
    }
}
