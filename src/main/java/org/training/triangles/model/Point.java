package org.training.triangles.model;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX (double setX) {
        x = setX;
    }

    public double getX() {
        return x;
    }

    public void setY(double setY) {
        y = setY;
    }

    public double getY() {
        return y;
    }
}
