package edu.example.cards;

public class Card {

    protected Suit suit;
    protected Rank rank;

    //Constructors
    Card(){
    };
    Card(Rank rank){
        this.rank = rank;
    }
    Card(Suit suit,Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
    Card(Suit suit){
        this.suit = suit;
    }
    public String getSuit(Suit suit){
        return  suit.toString() ;
    }
    @Override
    public String toString(){
        return rank + " of " + getSuit(suit);
    }

}
