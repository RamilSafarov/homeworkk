package com.t1.task1_2;

public class Cuboid extends ThreeDimensionalFigure {
    private double b;
    private double c;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Cuboid(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSquare(){
        return (2 * (getA() * b + b * c + getA() * c));
    }

    @Override
    public double getVolume(){
        return (getA() * b * c);
    }

    @Override
    public String toString() {
        return "Cuboid { " +
                "Square = " + getSquare() +
                ", Volume = " + getVolume() +
                '}';
    }
}
