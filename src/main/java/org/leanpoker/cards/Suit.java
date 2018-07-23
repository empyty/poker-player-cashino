package org.leanpoker.cards;

public enum Suit {
    SPADES(1, "spades"),
    HEARTS(2, "hearts"),
    DIAMONDS(3, "diamonds"),
    CLUBS(4, "clubs");

    private final int value;
    private final String name;

    Suit(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}

