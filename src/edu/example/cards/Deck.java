package edu.example.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();


    Deck() {
        while (cards.size() < (Suit.values().length * Rank.values().length)) {
            for (Rank ran : Rank.values()) {
                for (Suit sui : Suit.values()) {
                     Card card = new Card(sui, ran);
                     cards.add(card);
                }
            }
        }
    }
    public String drawCard(){
        Card card = cards.get(0);
        cards.remove(card);
        return card.toString();
    }
    protected void shuffleDeck(){
        Collections.shuffle(cards);
    }
    @Override
    public String toString() {
        return cards.toString();
    }
}
