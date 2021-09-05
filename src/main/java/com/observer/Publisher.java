package com.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {

    Map<String, List<Subscribers>> data = new HashMap<>();

    public void subscribe(String cell, Subscribers subscriber) {
        if (!data.containsKey(cell)) {
            data.put(cell, new ArrayList<>());
        }
        List<Subscribers> subscribers = data.get(cell);
        subscribers.add(subscriber);
    }

    public void sendNotify(String cell, int value) {
        List<Subscribers> subscribers = data.get(cell);
        for (Subscribers subscriber : subscribers) {
            subscriber.update(cell, value);
        }
    }

}
