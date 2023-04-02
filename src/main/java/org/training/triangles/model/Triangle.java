package org.training.triangles.model;

public class Triangle {
    private final Point firstPoint;

    private final Point secondPoint;

    private final Point thirdPoint;

    public Triangle (Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }


    public Point getFirstPoint() {
        return firstPoint;
    }


    public Point getSecondPoint() {
        return secondPoint;
    }


    public Point getThirdPoint() {

        return thirdPoint;
    }
}