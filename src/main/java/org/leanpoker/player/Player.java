package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.leanpoker.cards.Card;
import org.leanpoker.cards.CardUtils;

import java.util.ArrayList;
import java.util.List;

public class Player {

    static final String VERSION = "Testing betting";
    private static final int playerId = 4;

    public static int betRequest(JsonElement request) {
        JsonObject requestObject = request.getAsJsonObject();
        JsonElement ourPlayer = requestObject.get("players").getAsJsonArray().get(playerId);
        JsonArray ourCards = ourPlayer.getAsJsonObject().get("hole_cards").getAsJsonArray();
        JsonArray jsonCommunityCards = requestObject.get("community_cards").getAsJsonArray();
        List<Card> holeCards = setCards(ourCards);
        List<Card> communityCards = setCards(jsonCommunityCards);
//        int pot = requestObject.get("pot").getAsInt();
        int bet = ourPlayer.getAsJsonObject().get("bet").getAsInt();
        int minimumRaise = requestObject.get("minimum_raise").getAsInt();
        int currentBuyIn = requestObject.get("current_buy_in").getAsInt();

        int maxBetValue = CardUtils.checkHoleCards(holeCards);

        if (bet + minimumRaise <= maxBetValue) {
            if (currentBuyIn == bet && bet != 0) {
                System.out.println("Check");
                return 0;
            }
//            if (communityCards.size() > 0) {
//                return currentBuyIn - bet + minimumRaise;
//            }
            return currentBuyIn - bet;
        }
        return 0;
    }

    public static void showdown(JsonElement game) {
    }

    public static List<Card> setCards(JsonArray playerCards) {
        List<Card> holeCards = new ArrayList<>(2);
        for (JsonElement jsonCard : playerCards) {
            String rank = jsonCard.getAsJsonObject().get("rank").getAsString();
            String suit = jsonCard.getAsJsonObject().get("suit").getAsString();
            Card card = new Card(suit, rank);
            holeCards.add(card);
            System.out.println("Adding: " + card);
        }
        return holeCards;
    }

}
