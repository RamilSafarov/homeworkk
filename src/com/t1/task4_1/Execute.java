package com.t1.task4_1;

/**
 * Вторая задача - на исключения. Оформить решение квадратного уравнения в виде класса, если этого ещё не сделали.
 * Сбрасывать исключение java.lang.IllegalArgumentException, если a=0. Сброс делать в конструкторе и в сеттере (если он есть).
 * Обеспечить перехват исключения в вызываемом коде.
 */
public class Execute {
    public static void main(String[] args) {

        QuadraticEquation y = new QuadraticEquation(0,-10,-8);
        //y.getD();
        if (y.getD()>0){
            double x1 = y.getX1();
            double x2 = y.getX2();
            System.out.println("Первый корень уравнения x1 = " + x1 + "; " + "Второй корень уравнения x2 = " + x2 + ";");
        }
        else if (y.getD()==0){
            double x = y.getX();
            System.out.println("Единственный корень уравнения x = " + x);
        }
        else{
            System.out.println("Корней нет");
        }
        /*double a = 5;
        double b = -10;
        double c = -8;
        double d = b * b - 4 * a * c;
        if (d>0){
            double x1 = (-b - Math.sqrt(d))/ (2 * a);
            double x2 = (-b + Math.sqrt(d))/ (2 * a);
            System.out.println("Первый корень уравнения x1 = " + x1 + "; " + "Второй корень уравнения x2 = " + x2 + ";");
        }
        else if (d==0){
            double x = (-b)/(2 * a);
            System.out.println("Единственный корень уравнения x = " + x);
        }
        else{
            System.out.println("Корней нет");
        }*/
    }
}
