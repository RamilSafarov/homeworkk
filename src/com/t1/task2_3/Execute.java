package com.t1.task2_3;

import java.util.Locale;

/**
 * Задача 2* (сложная) - Дана строка. Найти в ней подстроку-палиндром максимальной длины за время O(n^2).
 */
public class Execute {
    public static void main(String[] args) {
        String In = "Дед слышал топот на этаже";
        String StrIn = In.toLowerCase(Locale.ROOT).replaceAll(" ", "");
        char StrInArray [] = StrIn.toCharArray();
        char StrOutArray [] = new char[StrIn.length()];
        String Polyndrom = "";
        String OutPolyndrom = "";
        int maxPolyndrom = Polyndrom.length();

        for (int count=StrIn.length()-1; count>=0; count--)
        {
            StrOutArray [StrIn.length()-count-1] = StrInArray[count];
        }

        String StrOut = new String(StrOutArray);
        //System.out.println(StrIn);
        //System.out.println(StrOut);

        for (int countIn=0; countIn<StrIn.length()-1; countIn++)
        {
            for (int countOut=0; countOut<StrOut.length(); countOut++)
            {
                //System.out.println("In: " +StrInArray[countIn]+ " Out: " + StrOutArray[countOut]);
                if (StrInArray[countIn] == StrOutArray[countOut])
                {
                    Polyndrom = Polyndrom + StrInArray[countIn];
                    if ((countOut!=StrOut.length()-1)&&StrInArray[countIn+1] == StrOutArray[countOut+1]){
                        countIn++;
                    }
                    else if ((countOut!=StrOut.length()-1)&&StrInArray[countIn+1] != StrOutArray[countOut+1]){
                        //Polyndrom = "";
                        if (Polyndrom.length()>maxPolyndrom){
                            maxPolyndrom=Polyndrom.length();
                            OutPolyndrom=Polyndrom;
                            //System.out.println("max "+ maxPolyndrom);
                        }
                        Polyndrom = "";
                        //countIn++;
                        continue;
                    }
                }
            }
            //System.out.println(Polyndrom);
            if (Polyndrom.length()>maxPolyndrom){
                maxPolyndrom=Polyndrom.length();
                //System.out.println("max "+ maxPolyndrom);
            }
            //Polyndrom = "";
            //System.out.println("Polyndrom обнулен " + countIn);
        }


        System.out.println("Найдена подстрока-палиндром \""+ OutPolyndrom +"\" максимальной длины " + maxPolyndrom);


    }
}
