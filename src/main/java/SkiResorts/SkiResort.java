package SkiResorts;

import Interfaces.IReviewed;

import java.util.ArrayList;

public class SkiResort {

    private String name;
    private ArrayList<IReviewed> allAreas;

    public SkiResort(String name){
        this.name = name;
        this.allAreas = new ArrayList<IReviewed>();
    }

    public String getName() {
        return name;
    }

    public void addReview(IReviewed area){
        allAreas.add(area);
    }

    public ArrayList<IReviewed> getAllReviews(){
        return allAreas;
    }
}
