package org.training.triangles;

import org.training.triangles.model.Point;
import org.training.triangles.model.Triangle;

public class Director {
    public static void main(String[] args) {

// создаем три точки и треугольник, передаем точки в объект треугольник
        Point pointOne = new Point(1.2, 3.5);
        Point pointTwo = new Point(5.4, 2.0);
        Point pointThree = new Point(4.0, 6.0);
        Triangle firstTriangle = new Triangle(pointOne, pointTwo, pointThree);

// вычисляем площадь треугольника

    }
}