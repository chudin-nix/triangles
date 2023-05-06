package org.training.triangles;

import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleObservable extends Triangle implements Observable {
    private final String id;
    private final List<Observer> observers = new ArrayList<>();

    public TriangleObservable(String id, Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void setFirstPoint (Point firstPoint) {
        super.setFirstPoint(firstPoint);
        notifyObservers();
    }

    @Override
    public void setSecondPoint (Point secondPoint) {
        super.setFirstPoint(secondPoint);
        notifyObservers();
    }

    @Override
    public void setThirdPoint (Point thirdPoint) {
        super.setFirstPoint(thirdPoint);
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }
}
