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

//    public static void checkCards(List playerCards) {
//        if (playerCards[1] == playerCards[2]) {
//
//        } else if ((playerCards[1] = playerCards[2] + 1 || playerCards[2] = playerCards[1] + 1) ||
//                (playerCards[1] == 13 && playerCards[2] == 1 || playerCards[1] == 1 && playerCards[2] == 13) &&
//                        playerCards[1].suit == playerCards[2].suit) {
//
//        } else if (playerCards[1] = playerCards[2] + 1 || playerCards[2] = playerCards[1] + 1 ||
//                (playerCards[1] == 13 && playerCards[2] == 1) || (playerCards[1] == 1 && playerCards[2] == 13)) {
//
//        } else if (playerCards[1].suit == playerCards[2].suit) {
//
//        } else {
//
//        }
//    }
}
