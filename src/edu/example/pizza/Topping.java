package edu.example.pizza;

import java.util.ArrayList;
import java.util.List;

public class Topping {

    protected String sauce = "no sauce";
    protected String cheese = "no cheese";
    protected List<String> meats = new ArrayList<>();
    protected List<String> veggies = new ArrayList<>();
    private String seasoning = "none";


    public Topping(){

    }
    public Topping(String sauce,String cheese){
        this.sauce = sauce;
        this.cheese =cheese;

    }

    public Topping(String sauce, String cheese, String seasoning){
        this.sauce = sauce;
        this.cheese = cheese;
        this.seasoning = seasoning;
    }

    protected String getMeats(){
        String meats = "";

        for (String m: this.meats) {
            meats += m + " ";
        }
        return meats;
    }

    @Override
    public String toString(){
        String tops = sauce + ", " + cheese + ", ";
        return tops + getMeats() + veggies;
    }

}
