package com.observer;

public class Cell {

    public Publisher publisher;
    private String name;

    public Cell(String name) {
        publisher = new Publisher();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(String name, int value) {
        publisher.sendNotify(name, value);
    }
}
