package com.observerFlow;

import java.util.concurrent.Flow;

public class Demo {
    public static void main(String[] args) {
        ArithmeticCell c3 = new ArithmeticCell("C3");
        ArithmeticCell c5 = new ArithmeticCell("C5");
        SimpleCell c4 = new SimpleCell("C4");

        SimpleCell c1 = new SimpleCell("C1");
        SimpleCell c2 = new SimpleCell("C2");
//        c1.subscribe(c3::setLeft);
//        c2.subscribe(c3::setRight);
//
//        c1.onNext(10);
//        c2.onNext(20);

        c3.subscribe(c5::setLeft);
        c4.subscribe(c5::setRight);
        c3.onNext(10);
        c4.onNext(56);
        c4.onNext(45);
    }
}
