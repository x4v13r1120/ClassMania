package edu.example.pokemon;


import java.util.Random;

/** Pokemon names and concept used from:
 * Pokemon Go. version 1.3.1, Niantic Inc., 10 Aug. 2016.
 * Apple App store, itunes.apple.com/us/app/pokemon-go/id1094591345?mt=8
 */

public class Pokemon {

    //Random instance so accessible in all methods
    private Random rand = new Random();


    /*
    all pokemon should have: name, level, type, hp, pp
     */

    private String name;
    private int level= 1;
    private String type;
    private int hp = 100;
    private int pp = 10;

    //default constructor
    //If Ash doesn't pick - he always gets
    public Pokemon(){
        name = "Charmander";
        type = "Fire";
    }
    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }


    //Basic getters and setters
    protected String getName() { return name; }

    protected void setName(String name) { this.name = name; }

    protected String getType() { return type; }

    protected void setType(String type) { this.type = type; }

    //access modifiers
    protected void levelUp(){
        level++;
        hp += level * 20;
        pp += level * 2;
    }

    protected String[] tackle(){
        //Returns a String array with the damage & attack type
        return new String[]{Integer.toString(getRandDamage(5,2)), "Normal" };
    }

    protected int getRandDamage(int max, int min){
        //internal function to determine random damage - thick dice
        return rand.nextInt((max - min) + 1) + 1;
    }

    protected int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    protected int getPp() {
        return pp;
    }

    protected void setPp(int pp) {
        this.pp = pp;
    }
}
