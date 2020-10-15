package edu.example.csvHomework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sport {
    // create Sport class here to handle data from CSV
    protected long eventId = 0;
    protected String team = "unknown";
    protected String date  = "unknown";
    protected String location = "unknown";

    protected String type = "unknown";
    private final Set<String> TYPES = new HashSet<>(Arrays.asList("baseball", "basketball",
            "soccer","football","hockey","racing","bowling"));

    private String city = "none";
    private String state = "none";
    int internalPrice = 0;

    //todo: constructors here

    public Sport(){ }

    public Sport(long eventId, String team, String date, String location, String type, double price) {
        this.eventId = eventId;
        this.team = team;
        this.date = date;
        this.location = location;
        this.type = type;
        price = getPrice();

    }
    public Sport(String[] csvLine){
        eventId = Long.parseLong(csvLine[0]);
        team = csvLine[1];
        date = csvLine[2];
        location = csvLine[3];
        type = csvLine[4];
        setPrice(Double.parseDouble(csvLine[5]));
    }
    public int getInternalPrice() { return internalPrice; }

    public double getPrice(){ return internalPrice / 100.0; }

    public void setPrice(double price) { this.internalPrice = (int)(price * 100); }

    public void setCityState(String city, String state){
        this.city = city;
        this.state = state;
        location = city +","+ state;
    }
    public String getState() { return state; }

    public String getCity() { return city; }

    public void setType(String type){
        if (TYPES.contains(type)){
            this.type = type;
        }else {
            this.type = "other";
        }
    }

    @Override
    public String toString() {
        return   eventId + "," + team + "," + date + "," + location + "," + type + ","+ getPrice() + "\n";
    }
}
