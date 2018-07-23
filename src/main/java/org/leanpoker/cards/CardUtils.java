package org.leanpoker.cards;

public class CardUtils {
    public static boolean areConsecutive(Card[] cards) {
        int card1Value = cards[0].getRank().getValue();
        int card2Value = cards[1].getRank().getValue();
        return Math.abs(card1Value - card2Value) > 1;
    }

}
