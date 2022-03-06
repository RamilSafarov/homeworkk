package com.t1.task1_1;
/**
 * Домашнее задание № 1 - сделать программу для решения квадратного уравнения с действительными коэффициентами.
 * Рассмотреть варианты с отсутствием действительных корней, одним и двумя корнями.
 */

public class Execute {
    public static void main(String[] args) {
        double a = 5;
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
        }
    }
}
