package com.bsejawal.behavioral.observer.postoffice;

public interface Subject {
    void attach(Observer o);
    void deattach(Observer o);
    void Notify();
}
