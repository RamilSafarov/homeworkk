package com.t1.task2_1;

/**
 * Задача 1 (простая) - Дана строка. Проверить, является ли она палиндромом.
 */
public class Execute {

    public static void main(String[] args) {
        String In = "Лёша на полке клопа нашёл";/*"abXba";*/
        String StrIn = In.replaceAll(" ", "");
        char StrInArray [] = StrIn.toCharArray();
        char StrOutArray [] = new char[StrIn.length()];

        for (int count=StrIn.length()-1; count>=0; count--)
        {
            StrOutArray [StrIn.length()-count-1] = StrInArray[count];
        }

        String StrOut = new String(StrOutArray);

        if (StrIn.equalsIgnoreCase(StrOut))
        {
            System.out.println("Строка \"" + In + "\" является палиндромом.");
        }
        else {
            System.out.println("Строка \"" + In + "\" не является палиндромом.");
        }


    }
}
