package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.HashMap;
import java.util.Map;

public class Player {

    static final String VERSION = "Testing JSON objects - players";

    private String name;

    public static int betRequest(JsonElement request) {
        System.out.println(request.getAsJsonObject().get("players").getAsJsonArray().get(4));

        Gson gson = new Gson();
        String json = request.getAsString();
        Map<String,Object> map = new HashMap<String,Object>();
        map = (Map<String,Object>) gson.fromJson(json, map.getClass());
        System.out.print("WIREK");
        System.out.println(map.keySet());
        return 10;
    }

    public static void showdown(JsonElement game) {
    }
}
