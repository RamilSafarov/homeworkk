package com.t1.task1_2;

public abstract class ThreeDimensionalFigure {


    protected double a;

    public ThreeDimensionalFigure(double a) {
        this.a = a;
    }

    protected ThreeDimensionalFigure() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public abstract double getSquare();

    public abstract double getVolume();
}
