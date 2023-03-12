package org.training.triangles.model;

public class Triangle {
    private Point firstPoint;

    private Point secondPoint;

    private Point thirdPoint;

    public Triangle (Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public void setFirstPoint(Point setOnePoint) {
        firstPoint = setOnePoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setSecondPoint(Point setSecondPoint) {
        secondPoint = setSecondPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setThirdPoint(Point setThirdPoint) {
        thirdPoint = setThirdPoint;
    }
}