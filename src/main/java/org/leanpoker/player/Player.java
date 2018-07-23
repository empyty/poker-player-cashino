package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Testing JSON objects - players";

    public static int betRequest(JsonElement request) {
<<<<<<< HEAD
        System.out.println(request.getAsJsonObject().get("players").getAsJsonArray().get(4));
=======
        System.out.println(request.getAsJsonObject().get("players").getAsJsonArray());
>>>>>>> master
        System.out.println(request.getAsJsonObject());
        return 10;
    }

    public static void showdown(JsonElement game) {
    }
}
