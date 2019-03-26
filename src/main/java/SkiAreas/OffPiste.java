package SkiAreas;

import Interfaces.IReviewed;

public class OffPiste extends SkiRun implements IReviewed {

    private String avalanchRisk;

    public OffPiste(String name, String ability, int rating, String avalanchRisk) {
        super(name, ability, rating);
        this.avalanchRisk = avalanchRisk;
    }

    public String getAvalanchRisk() {
        return avalanchRisk;
    }

    public void setAvalanchRisk(String avalanchRisk) {
        this.avalanchRisk = avalanchRisk;
    }
}
