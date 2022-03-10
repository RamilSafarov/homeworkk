package com.t1.task5_1;

import java.util.UUID;

public class Buyer extends User implements Comparable<Buyer>  {
    public String FIO;
    public String Phone;
    public UUID ID;

    public String getFIO() {
        return FIO;
    }

    @Override
    public String toString() {
        return ID +
                ", " + FIO +
                ", " + login +
                ", " + Phone;
    }

    public Buyer(UUID ID, String FIO, String login, String phone) {
        super(login);
        this.FIO = FIO;
        Phone = phone;
        this.ID = ID;
    }

    @Override
    public int compareTo(Buyer o) {
        return 0;
    }
}
