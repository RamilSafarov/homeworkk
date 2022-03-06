package com.t1.task3_1;

public class Student implements Comparable<Student> {
    private int NumOfClass;
    private String Name;


    public Student(int numOfClass, String name ) {
        NumOfClass = numOfClass;
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NumOfClass=" + NumOfClass +
                ", Name='" + Name + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public int getNumOfClass() {
        return NumOfClass;
    }

    @Override
    public int compareTo(Student o) {
        return Name.compareTo(o.getName());
    }
}
