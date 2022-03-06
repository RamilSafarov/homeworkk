package com.t1.task1_2;

public class Cube extends ThreeDimensionalFigure {

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Cube(double a) {
        super (a);
    }

    @Override
    public double getSquare(){
        return (6 * (a * a));
    }

    @Override
    public double getVolume(){
        return (a * a * a);
    }

    @Override
    public String toString() {
        return "Cube { " +
                "Square = " + getSquare() +
                ", Volume = " + getVolume() +
                '}';
    }
}
