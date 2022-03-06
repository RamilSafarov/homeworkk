package com.t1.task4_1;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double d;

    public double getD (){
        return b * b - 4 * a * c;
    }

    public double getX (){
        return (-b)/(2 * a);
    }

    public double getX1 (){
        return (-b - Math.sqrt(d))/ (2 * a);
    }

    public double getX2 (){
        return (-b + Math.sqrt(d))/ (2 * a);
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
        try{
            this.a = a;
            this.b = b;
            this.c = c;
        }
        catch (IllegalArgumentException e){
            System.out.println("A = 0" + e);
        }
    }
}
