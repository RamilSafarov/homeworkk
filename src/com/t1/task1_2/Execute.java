package com.t1.task1_2;
/**
 * Домашнее задание № 2 - сделать абстрактный класс «трёхмерная фигура», с методами «объём» и «площадь поверхности».
 * Написать его реализации для шара, куба, прямоугольного параллепипеда.
 */

public class Execute {
    public static void main(String[] args) {
        ThreeDimensionalFigure[] figures = {
                new Sphere(30),
                new Cuboid(50,60, 70),
                new Cube(40)};

        for (ThreeDimensionalFigure curFigure : figures){
            double Square = curFigure.getSquare();
            double Volume = curFigure.getVolume();
            System.out.println(curFigure.toString());
            }
        }
    }

