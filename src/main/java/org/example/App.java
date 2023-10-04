package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("IsPrime(-5)" + ":" + Arithmetic.IsPrime(-5));
        System.out.println("IsPrime(5)" + ":" + Arithmetic.IsPrime(5));
        try {
            System.out.println("CalculateFacotorial(5):" + Arithmetic.calculateFactorial(5));
            System.out.println("CalculateFacotorial(-5):" + Arithmetic.calculateFactorial(-5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        int[] nums = {4, 10, 23, 19, 20, 67, 23, 13, 20, 34};
        System.out.print("Arithmetic.getMinimum(), Arithmetic.getMaximum():");
        System.out.println(Arithmetic.getMinimum(nums) + "," + Arithmetic.getMaximum(nums));

        System.out.println("findGCD(36,48,60,72):" + Arithmetic.findGCD(36, 48, 60, 72));
        System.out.println("findGCD(36,48):" + Arithmetic.findGCD(36, 48));

        System.out.println("findLCM(36,48,60,72):" + Arithmetic.findLCM(36, 48, 60, 72));
        System.out.println("findLCM(36,48,60,72):" + Arithmetic.findLCM(36, 48));

        System.out.println("Arithmetic.getTwoBase(20312):" + Arithmetic.getTwoBase(20312));


        // Недилько Владислав Григорьевич
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите номер последнего члена n: ");
        int n = sc.nextInt();

        System.out.print("Введите первый член прогрессии: ");
        double firstValue = sc.nextDouble();

        System.out.print("Введите разность прогрессии: ");
        double difference = sc.nextDouble();

        System.out.println("1 - Последний член арифметической прогрессии | 2 - Сумма арифметической прогрессии | 3 - Всё вместе");
        System.out.print("Выберите действие: ");
        char action = sc.next().charAt(0);

        switch (action) {
            case '1':
                System.out.println("Последний член арифметической прогрессии a" + "(" + n + "): " + Arithmetic.aProgression(n, firstValue, difference));
                break;
            case '2':
                System.out.println("Сумма арифметической прогрессии S" + "(" + n + "): " + Arithmetic.aProgressionSum(n, firstValue, difference));
                break;
            case '3':
                System.out.println("Последний член арифметической прогрессии a" + "(" + n + "): " + Arithmetic.aProgression(n, firstValue, difference));
                System.out.println("Сумма арифметической прогрессии S" + "(" + n + "): " + Arithmetic.aProgressionSum(n, firstValue, difference));
                break;
            default:
                System.out.println("Такого варианта нет в списке!");
                break;
        }
    }
}

// hello from Zpubus