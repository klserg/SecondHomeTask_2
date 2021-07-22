package com.mycompany.myapp;

import static java.lang.Math.*;

public class Point {
    private double coordinateX;
    private double coordinateY;
    private static int count = 0;

    @Override
    public String toString() {
        return String.format("Point (X=%.1f; Y=%.1f)", coordinateX, coordinateY);
    }

    public Point(double x, double y) {
        coordinateX = x;
        coordinateY = y;
        count++;
    }

    public int getCount() {
        return count;
    }
    public double distanceTo(Point p) {
        double dx = p.coordinateX - this.coordinateX;
        double dy = p.coordinateY - this.coordinateY;
        return sqrt(pow(dx,2) + pow(dy, 2));
    }
}
