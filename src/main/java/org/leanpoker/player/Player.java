package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Testing JSON objects - players";

    public static int betRequest(JsonElement request) {
        System.out.println(request.getAsJsonObject().get("players").getAsJsonArray()[4]);
        System.out.println("Wirek test");
        System.out.println(request.getAsJsonObject().get("players").getAsJsonObject().get("Cashino").getAsJsonArray());
        System.out.println(request.getAsJsonObject());
        return 10;
    }

    public static void showdown(JsonElement game) {
    }
}
