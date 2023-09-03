package hw2;

import java.util.Scanner;

public class task4 {
    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    //Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args)
    {
        try {
            emptyStringCheck();
        } catch (IllegalArgumentException e) {
            e.getMessage();
            System.out.println("!!!!!!!!!!!!! Пустую строку водить нельзя !!!!!!!!!!!! ");
    }

    }

    public static void emptyStringCheck() {
        String chkStr;

        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        chkStr = scanner.nextLine();
        if (chkStr.isEmpty()) {
            throw new IllegalArgumentException("!!!!!!!!!!!!! Пустую строку водить нельзя !!!!!!!!!!!! ");
        } else {
            System.out.println("Все в порядке!");
        }

    }
}
