package com.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDisplay {

    public static String toJson(Object object) {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(object);
        return  json;
    }
}
