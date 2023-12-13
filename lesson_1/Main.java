package lesson_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1 задание
        System.out.println("Введите два числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Сумма чисел: " + (a + b));

        // 2 задание
        System.out.println("Hello World");
        System.out.println();

        // 3 задание
        System.out.println("Введите Ваше имя: ");
        String user = scan.next();
        System.out.println("Hello " + user);


    }
}