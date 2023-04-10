package org.training.triangles;

import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleObservable extends Triangle implements Observable {
    private final Integer id;
    private final List<Observer> observers = new ArrayList<>();

    public TriangleObservable(Integer id, Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void setFirstPoint (Point firstPoint) {
        super.setFirstPoint(firstPoint);
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
