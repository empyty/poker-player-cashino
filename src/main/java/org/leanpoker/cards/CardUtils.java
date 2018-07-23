package org.leanpoker.cards;

import java.util.List;

public class CardUtils {
    public static boolean areConsecutive(List<Card> cards) {
        int card1Value = cards.get(0).getRank().getValue();
        int card2Value = cards.get(1).getRank().getValue();
        int diff = Math.abs(card1Value - card2Value);
        return diff == 1 || diff == 12;
    }

    public static boolean areSameSuit(List<Card> cards) {
        return cards.get(0).getSuit() == cards.get(1).getSuit();
    }

    public static boolean areSameRank(List<Card> cards) {
        return cards.get(0).getRank() == cards.get(1).getRank();
    }

    public static int cardRanksValue(List<Card> cards) {
        return cards.get(0).getRank().getValue() + cards.get(1).getRank().getValue();
    }

    public static int checkCards(List<Card> cards) {
        int maxBetValue = 300;
        if (areSameRank(cards)) {
            System.out.println("Same rank.");
            maxBetValue -= 50;
        } else if (areConsecutive(cards)) {
            if (areSameSuit(cards)) {
                System.out.println("Consecutive and same suit.");
            } else {
                System.out.println("Consecutive.");
                maxBetValue -= 150;
            }
        } else if (areSameSuit(cards)) {
            System.out.println("Same suit.");
            maxBetValue -= 100;
        } else {
            System.out.println("Gowno");
            maxBetValue = 100;
        }
        System.out.println(maxBetValue);
        return maxBetValue;
    }
}
