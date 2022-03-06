package com.t1.task3_1;

import java.util.Comparator;

public class ClassComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getNumOfClass() == o2.getNumOfClass()) {
            return 0;
        }
        if (o1.getNumOfClass() > o2.getNumOfClass()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
