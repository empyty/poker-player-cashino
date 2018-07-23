package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Testing JSON objects";

    public static int betRequest(JsonElement request) {
        System.out.println(request.getAsJsonObject());
        return 10;
    }

    public static void showdown(JsonElement game) {
    }
}
