package edu.example.pokemon;

public class ElectricPokemon extends Pokemon {
    //extends Pokemon Type specific pokemon


    public ElectricPokemon(){
    super("Pikachu","Electric");
    }

    public ElectricPokemon(String eName, String eType) {
        //we ignore type but allow this constructor to "Override" Pokemon
        super(eName,"Electric");
    }

    public  ElectricPokemon(String eName, int startHP, int startPP){
        super(eName, "Electric");
        setHp(startHP);
        setPp(startPP);
    }

    protected String[] spark(){
        return new String[]{Integer.toString(getRandDamage(10,2)),"Electric"};
    }
}
