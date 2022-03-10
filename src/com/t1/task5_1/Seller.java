package com.t1.task5_1;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Seller extends User {

    public Seller(String login) {
        super(login);
    }

    static void ViewActiveBuyers (ArrayList<Buyer> BuyerArrayList){
        try {
            FileWriter outputfile = new FileWriter("task5_1_Output.csv");
            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = {"ID", "FIO", "Login", "Phone"};
            writer.writeNext(header);
            Comparator<Buyer> myClassComparator = new FioComparator();
            BuyerArrayList.sort(myClassComparator);
            for (Buyer h: BuyerArrayList) {
                writer.writeNext(h.toString().split(", "));
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
