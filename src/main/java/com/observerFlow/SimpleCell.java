package com.observerFlow;

import java.util.ArrayList;
import java.util.List;

public class SimpleCell implements Publisher<Integer>, Subscriber<Integer> {

    private int value;
    private String name;
    private List<Subscriber> list = new ArrayList<>();

    public SimpleCell(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber<? super Integer> subscriber) {
        list.add(subscriber);
    }

    @Override
    public void onNext(Integer newValue) {
        this.value = newValue;
        System.out.println(this.name + ":" + this.value);
        //оповестить всех подписчиков о новом значении
        notifyAllSubscribers();
    }

    private void notifyAllSubscribers() {
        list.forEach(subscriber -> subscriber.onNext(this.value));
    }
}
