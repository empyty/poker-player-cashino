package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.leanpoker.cards.Card;
import org.leanpoker.cards.CardUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Player {

    static final String VERSION = "Testing betting";
    private static final int playerId = 4;

    public static int betRequest(JsonElement request) {
        JsonObject requestObject = request.getAsJsonObject();
        JsonElement ourPlayer = requestObject.get("players").getAsJsonArray().get(playerId);
        JsonArray ourCards = ourPlayer.getAsJsonObject().get("hole_cards").getAsJsonArray();
        List<Card> cards = setHoleCards(ourCards);
//        int pot = requestObject.get("pot").getAsInt();
        int bet = ourPlayer.getAsJsonObject().get("bet").getAsInt();
        int minimumRaise = requestObject.get("minimum_raise").getAsInt();
        int currentBuyIn = requestObject.get("current_buy_in").getAsInt();

        int maxBetValue = CardUtils.checkCards(cards);

        if (bet + minimumRaise <= maxBetValue) {
            if (currentBuyIn == bet && bet != 0) {
                System.out.println("Check");
                return 10;
            }
            return currentBuyIn - bet + minimumRaise;
        }
        return 10;
    }

    public static void showdown(JsonElement game) {
    }

    public static List<Card> setHoleCards(JsonArray playerCards) {
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
