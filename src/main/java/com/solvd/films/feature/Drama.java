package com.solvd.films.feature;


public class Drama extends Feature {


    public Drama(){
        setName("Green Mile");
        setReleaseYear(1999);
        setDurationMinutes(189);
        setProducer("Frank Darabont");

    }

    public Drama(String name, int releaseYear, int durationMinutes, String producer){
        super(name, releaseYear, durationMinutes, producer);
    }

    @Override
    public String toString(){
        return ("Drama\n" + "Name: " + getName() + "\nRelease year: " + getReleaseYear() +" year" + "\nDuration minutes: " + getDurationMinutes() + " minutes" + "\nProducer: " + getProducer());
    }

}


