package Task04;

import java.util.Scanner;

public class Multipliers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0;
        System.out.println("Введите целое число: ");
        if(input.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            x = input.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
        } else {
            System.out.println("Вы ввели не целое число");
            return;
        }

        double sqrt = Math.sqrt(x);
        int currentValue = x;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt)
        {
            if (currentValue % multiplier == 0)
            {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            }
            else if (multiplier == 2)
            {
                multiplier++;
            }
            else
            {
                multiplier += 2;
            }
        }
        if (currentValue != 1)
        {
            System.out.print(currentValue);
        }
    }
}
