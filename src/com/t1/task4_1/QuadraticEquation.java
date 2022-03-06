package com.t1.task4_1;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double d;

    public double getD (){
        return getB() * getB() - 4 * getA() * getC();
    }

    public double getX (){
        return (-getB())/(2 * getA());
    }

    public double getX1 (){
        return ((-getB() - Math.sqrt(getD()))/(2*getA()));
    }

    public double getX2 (){
        return (-getB() + Math.sqrt(getD())) / (2 * getA());
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

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

    public void setD(double d) {
        this.d = d;
    }

    public QuadraticEquation(double a, double b, double c) throws IllegalArgumentException{
        this.a = a;
        this.b = b;
        this.c = c;
        if (this.a==0){
            throw new IllegalArgumentException();
        }
    }
}
