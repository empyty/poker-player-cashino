package org.leanpoker.cards;

import java.util.List;

public class CardUtils {
    public static boolean areConsecutive(List<Card> cards) {
        int card1Value = cards.get(0).getRank().getValue();
        int card2Value = cards.get(1).getRank().getValue();
        return Math.abs(card1Value - card2Value) > 1;
    }

}
