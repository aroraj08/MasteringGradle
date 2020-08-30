package com.gradle;

import com.json.JsonDisplay;

public class Main {

    public static void main(String[] args) {
        Greet greet = new Greet("Hello Gradle", "Author");
        System.out.println(JsonDisplay.toJson(greet));
    }
}
