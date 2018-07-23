package org.leanpoker.cards;

import java.util.HashMap;

public class Card {

    public static final HashMap<String, Suit> suits;
    public static final HashMap<String, Rank> ranks;
    static {
        suits = new HashMap<>(4);
        ranks = new HashMap<>(13);
        suits.put("spades", Suit.SPADES);
        suits.put("hearts", Suit.HEARTS);
        suits.put("diamonds", Suit.DIAMONDS);
        suits.put("clubs", Suit.CLUBS);

        ranks.put("A", Rank.ACE);
        ranks.put("2", Rank.TWO);
        ranks.put("3", Rank.THREE);
        ranks.put("4", Rank.FOUR);
        ranks.put("5", Rank.FIVE);
        ranks.put("6", Rank.SIX);
        ranks.put("7", Rank.SEVEN);
        ranks.put("8", Rank.EIGHT);
        ranks.put("9", Rank.NINE);
        ranks.put("10", Rank.TEN);
        ranks.put("J", Rank.JACK);
        ranks.put("Q", Rank.QUEEN);
        ranks.put("K", Rank.KING);
    }

    private Suit suit;
    private Rank rank;
    private int value;

    public Card(String suit, String rank) {
        this.suit = suits.get(suit);
        this.rank = ranks.get(rank);
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return this.suit.toString() + this.rank.toString();
    }
}
