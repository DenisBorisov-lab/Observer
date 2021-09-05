package com.observer;

import java.util.HashMap;
import java.util.Map;

public class ResultCell implements Subscribers {

    private String name;
    private Map<String, Integer> map;

    public ResultCell(String name) {
        this.name = name;
        this.map = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String cell, int value) {
        addMap(cell, value);
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println(getName() + ": " + sum);
    }

    public void addMap(String cell, int value) {
        if (map.containsKey(cell)) {
            map.replace(cell, value);
        } else {
            map.put(cell, value);
        }
    }
}
