package ru.raif.cources.map.maploss;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BadKey badKeyIn = new BadKey(10);
        BadKey badKeySearch = new BadKey(10);

        HashMap<BadKey, String> map = new HashMap<>();
        map.put(badKeyIn, "val");
        badKeyIn.setValue(99999999);

        System.out.println(map.containsKey(badKeySearch));
    }
}
