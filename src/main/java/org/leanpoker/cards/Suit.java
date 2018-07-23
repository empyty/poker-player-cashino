package org.leanpoker.cards;

public enum Suit {
    SPADES(1, "spades", Color.BLACK),
    HEARTS(2, "hearts", Color.RED),
    DIAMONDS(3, "diamonds", Color.RED),
    CLUBS(4, "clubs", Color.BLACK);

    private final int value;
    private final String name;
    private final Color color;

    Suit(int value, String name, Color color) {
        this.value = value;
        this.name = name;
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.valueOf(this.name);
    }

    public enum Color {
        BLACK,
        RED
    }
}

