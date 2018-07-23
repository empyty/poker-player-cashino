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

    static final String VERSION = "Testing JSON objects - players";
    private static final int playerId = 4;

    private static String name;
    private static List<Card> holeCards;

    public static int betRequest(JsonElement request) {
        JsonObject requestObject = request.getAsJsonObject();
        JsonElement ourPlayer = requestObject.get("players").getAsJsonArray().get(playerId);
        JsonArray ourCards = ourPlayer.getAsJsonObject().get("hole_cards").getAsJsonArray();
        setHoleCards(ourCards);
        System.out.println(CardUtils.areConsecutive(holeCards));
        return 10;
    }

    public static void showdown(JsonElement game) {
    }

    public static void setHoleCards(JsonArray playerCards) {
        holeCards = new ArrayList<>(2);
        for (JsonElement jsonCard : playerCards) {
            String rank = jsonCard.getAsJsonObject().get("rank").getAsString();
            String suit = jsonCard.getAsJsonObject().get("suit").getAsString();
            Card card = new Card(suit, rank);
            holeCards.add(card);
            System.out.println("Adding: " + card);
        }
    }
}
