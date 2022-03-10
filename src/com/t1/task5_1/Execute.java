package com.t1.task5_1;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.w3c.dom.ls.LSOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.UUID;

/**
 * 1. Создать абстрактный класс «Пользователь». У него должно быть публичное свойство «Логин», приватное свойство «пароль».
 *  2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
 *  3. У продавца есть дополнительный метод «Посмотреть активных покупателей» , а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
 *  4. Есть исходный csv-файл со списком покупателей в формате: ФИО, Логин, пароль, телефон.
 *  4.1 Если строчка парсится (т.е. для каждого из полей выполняются условия, которые вы сами зададите своими регулярками), то такой покупатель создается в системе через конструктор класса "Покупатель". Таким образом,должна появиться коллекция покупателей с присвоенными ID.
 *  4.2 Если какая-то строка не парсится корректно, то выдается исключение. Исключение должно быть перехвачено, чтобы оно не приводило к аварийному завершению программы.
 *  5. Далее происходит вызов метода продавца  «Посмотреть активных покупателей», в котором реализован вывод в итоговый csv-файл с сортировкой покупателей по ФИО. Сортировку реализовать с помощью интерфейса "Comparable".
 */

public class Execute {
    //Пример Медведев Иван Васильевич
    public static String fioRegex = "([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)";

    //Длина от 3-16, без спец символов
    public static String loginRegex = "^[a-z0-9_-]{3,16}$";

    //Мин 8 символов, должна присутствовать заглавная буква, цифра и спец символ.
    public static String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";

    //Пример +7(999)888-77-66
    public static String phoneRegex = "\\+7[(]?(\\d{3})[)]?\\d{3}[-]?\\d{2}[-]?\\d{2}";

    public static boolean isFIO(String x) {

        return x.matches(fioRegex);
    }

    public static boolean isLogin(String x) {

        return x.matches(loginRegex);
    }

    public static boolean isPassword(String x) {

        return x.matches(passwordRegex);
    }

    public static boolean isPhone(String x) {

        return x.matches(phoneRegex);
    }


    public static void main(String[] args) {
        CSVReader reader = null;
        ArrayList<Buyer> BuyerArrayList = new ArrayList<>();

        String fioBuff = null;
        String loginBuff = null;
        String passwordBuffer = null;
        String phoneBuffer = null;

        try{
            reader = new CSVReader(new FileReader("task5_1_Input.csv"),';');
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null){
                for (String token : nextLine) {
                    if (isFIO(token) == true) {
                        fioBuff = token;
                    }
                    if (isLogin(token) == true) {
                        loginBuff = token;
                    }

                    if (isPassword(token) == true) {
                        passwordBuffer = token;
                    }

                    if (isPhone(token) == true) {
                        phoneBuffer = token;
                    }
                }
                if (fioBuff != null && loginBuff != null && passwordBuffer != null && phoneBuffer != null ){
                    UUID uuid = UUID.randomUUID();
                    BuyerArrayList.add(new Buyer(uuid, fioBuff, loginBuff, phoneBuffer));
                    fioBuff = null;
                    loginBuff = null;
                    passwordBuffer = null;
                    phoneBuffer = null;
                }else if (fioBuff == null && loginBuff != null && passwordBuffer != null && phoneBuffer != null){
                    System.out.println("Не верно введено поле ФИО. Пример ФИО: Медведев Иван Васильевич.");
                    fioBuff = null;
                    loginBuff = null;
                    passwordBuffer = null;
                    phoneBuffer = null;
                    continue;
                }
                else if (fioBuff != null && loginBuff == null && passwordBuffer != null && phoneBuffer != null){
                    System.out.println("Не верно введено поле логин. Длина поля от 3-16, без спец символов");
                    fioBuff = null;
                    loginBuff = null;
                    passwordBuffer = null;
                    phoneBuffer = null;
                    continue;
                }
                else if (fioBuff != null && loginBuff != null && passwordBuffer == null && phoneBuffer != null){
                    System.out.println("Не верно введено поле пароль. Длина поля от 8 символов, должна присутствовать заглавная буква, цифра и спец символ.");
                    fioBuff = null;
                    loginBuff = null;
                    passwordBuffer = null;
                    phoneBuffer = null;
                    continue;
                }
                else if (fioBuff != null && loginBuff != null && passwordBuffer != null && phoneBuffer == null){
                    System.out.println("Не верно введено поле телефон. Пример +7(999)888-77-66");
                    fioBuff = null;
                    loginBuff = null;
                    passwordBuffer = null;
                    phoneBuffer = null;
                    continue;
                }
            }
            Seller.ViewActiveBuyers(BuyerArrayList);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
