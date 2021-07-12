package Task05;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");

        String stringToProc = input.nextLine(); //строка для обработки

        char[] vocalArr = new char[]{'а', 'о', 'э', 'е', 'и', 'ы', 'у', 'ё', 'ю', 'я'};  //массив гласных

        int counter = 0; //результат

        char[] arrayToProc = stringToProc.toCharArray(); //получаем массив

        for (char ch : arrayToProc) {          //вложенный цикл
            for (char ch2 : vocalArr) {
                if (ch == ch2) {
                    counter++;
                    break; // если символ ch = ch2, то нет смысла продолжать
                }
            }
        }

        System.out.println ("Количество гласных: " + counter);  //вывод в консоль кол-во гласных
    }
}