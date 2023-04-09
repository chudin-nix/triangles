package org.training.triangles;

public interface Observer {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
