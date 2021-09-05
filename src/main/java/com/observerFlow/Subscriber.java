package com.observerFlow;

public interface Subscriber<T> {
    void onNext(T t);
}
