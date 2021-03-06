package com.t1.task4_1;

/**
 * Вторая задача - на исключения. Оформить решение квадратного уравнения в виде класса, если этого ещё не сделали.
 * Сбрасывать исключение java.lang.IllegalArgumentException, если a=0. Сброс делать в конструкторе и в сеттере (если он есть).
 * Обеспечить перехват исключения в вызываемом коде.
 */
public class Execute {
    public static void main(String[] args) {
        try{
            QuadraticEquation y = new QuadraticEquation(5,-10,-8);
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
        }
        catch (IllegalArgumentException e){
            System.out.println("Исключение A = 0");
        }
    }
}
