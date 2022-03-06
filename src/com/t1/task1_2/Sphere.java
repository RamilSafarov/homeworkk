package com.t1.task1_2;

public class Sphere extends ThreeDimensionalFigure{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare(){
        return (4 * getRadius() * getRadius() * Math.PI);
    }

    @Override
    public double getVolume(){
        return (4 * getRadius() * getRadius() * getRadius() * Math.PI) / 3;
    }

    @Override
    public String toString() {
        return "Sphere { " +
                "Square = " + getSquare() +
                ", Volume = " + getVolume() +
                '}';
    }
}
