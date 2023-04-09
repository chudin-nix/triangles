package org.training.triangles.model;

import java.util.Objects;

public class Triangle {
    private Point firstPoint;

    private Point secondPoint;

    private Point thirdPoint;

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

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(firstPoint, triangle.firstPoint) && Objects.equals(secondPoint, triangle.secondPoint) && Objects.equals(thirdPoint, triangle.thirdPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPoint, secondPoint, thirdPoint);
    }
}