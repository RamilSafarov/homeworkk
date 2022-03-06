package com.t1.task3_1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Задача: программа на вход получает список школьников следующего вида:
 * 9 Иванов
 * 10 Петров
 * 11 Сидоров
 * 9 Григорьев
 * 9 Сергеев
 * 10 Яковлев
 * В каждой строке сначала записан номер класса (число, равное 9, 10 или 11), затем (через пробел) – фамилия.
 * Необходимо вывести список по классам: сначала всех учащихся 1 класса, затем – 2, и так до 11.
 * Внутри класса выводить список учеников по алфавиту.
 */
public class Execute {
    public static void main(String[] args) {
        ArrayList<Student> StudentArrayList = new ArrayList<>();

        /*Student Student1 = new Student(2, "Коровин");
        Student Student2 = new Student(9, "Иванов");
        Student Student3 = new Student(10, "Петров");
        Student Student4 = new Student(11, "Сидоров");
        Student Student5 = new Student(9, "Григорьев");
        Student Student6 = new Student(9, "Сергеев");
        Student Student7 = new Student(10, "Яковлев");
        Student Student8 = new Student(2, "Пупкин");
        Student Student9 = new Student(1, "Васильев");*/

        StudentArrayList.add(new Student(2, "Коровин"));
        StudentArrayList.add(new Student(9, "Иванов"));
        StudentArrayList.add(new Student(10, "Петров"));
        StudentArrayList.add(new Student(11, "Сидоров"));
        StudentArrayList.add(new Student(9, "Григорьев"));
        StudentArrayList.add(new Student(9, "Сергеев"));
        StudentArrayList.add(new Student(10, "Яковлев"));
        StudentArrayList.add(new Student(2, "Аупкин"));
        StudentArrayList.add(new Student(1, "Васильев"));

        /*StudentArrayList.add(Student1);
        StudentArrayList.add(Student2);
        StudentArrayList.add(Student3);
        StudentArrayList.add(Student4);
        StudentArrayList.add(Student5);
        StudentArrayList.add(Student6);
        StudentArrayList.add(Student7);
        StudentArrayList.add(Student8);
        StudentArrayList.add(Student9);*/


        //System.out.println(StudentArrayList);

        /*for (Student h: StudentArrayList) {
            System.out.println(h);
        }*/

        // myClassComparator = (ClassComparator) new ClassComparator().thenComparing(new NameComparator());
        Comparator<Student> myClassComparator = new ClassComparator().thenComparing(new NameComparator());
        StudentArrayList.sort(myClassComparator);

       /* NameComparator myNameComparator = new NameComparator();
        StudentArrayList.sort(myNameComparator);*/

        System.out.println("Отсортированы : ");
        for (Student h: StudentArrayList) {
            System.out.println(h);
        }

    }
}
