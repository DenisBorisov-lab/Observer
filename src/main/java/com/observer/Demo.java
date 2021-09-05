package com.observer;

public class Demo {
    public static void main(String[] args) {
        Cell c1 = new Cell("C1");
        Cell c2 = new Cell("C2");
        ResultCell c3 = new ResultCell("C3");
        c1.publisher.subscribe(c1.getName(), c3);
        c2.publisher.subscribe(c2.getName(), c3);
        c1.setValue(c1.getName(), 5);
        c2.setValue(c2.getName(), 6);
        Cell c4 = new Cell("C4");
        c4.publisher.subscribe(c4.getName(), c3);
        c4.setValue(c4.getName(), 9);
    }
}
