package com.observerFlow;

public interface Publisher<T> {
    void subscribe(Subscriber<? super T> subscriber);
}
