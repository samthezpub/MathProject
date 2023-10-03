package org.example;

public class Arithmetic {
    public static boolean IsPrime(double num) {
        if (num > 0) {
            return true;
        }
        return false;
    }

    public static boolean IsYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static long calculateFactorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int parseIntToDouble(double a ){
        int b = (int) a;
        return b;
    }

    //Пажин Владимир Альбертович
    public static int getMaximum (int[] mass)
    {
        int temp = mass[0];//сюда будет записываться наибольшее значение

        for (int i = 0; i < mass.length; i++)
        {
            if (temp < mass[i])//если temp меньше текущего элемента - он равняется ему
            {
                temp = mass[i];
            }
        }
        return temp;
    }

    //Пажин Владимир Альбертович
    public static int getMinimum (int[] mass)
    {
        int temp = mass[0];//сюда будет записываться наименьшее значение
        for (int i = 0; i < mass.length; i++)
        {
            if (temp > mass[i])//если temp больше текущего элемента - он равняется ему
            {
                temp = mass[i];
            }
        }
        return temp;
    }

    //Проц Артём Викторович
    public static String getTwoBase(int num) {
        String res = "";
        while (num > 0) {
            res = Integer.toString(num % 2) + res;
            num /= 2;
        }
        return res;
    }

    public static int findGCD(int a, int b, int c, int d) {
        int gcdAB = findGCD(a, b);
        int gcdCD = findGCD(c, d);
        return findGCD(gcdAB, gcdCD);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int c, int d) {
        int lcmAB = findLCM(a, b);
        int lcmCD = findLCM(c, d);
        return findLCM(lcmAB, lcmCD);
    }

    public static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return (a * b) / gcd;
    }

    //Недилько Владислав Григорьевич
    public static double aProgression(int n, double firstValue, double difference){
        double result = firstValue + (difference * (n - 1));
        return result; // Считает последний член арифметической прогрессии
    }

    //Недилько Владислав Григорьевич
    public static double aProgressionSum(int n, double firstValue, double difference){
        double aProgressionResult = firstValue + (difference * (n - 1));
        double result = ((firstValue + aProgressionResult) * n) / 2;
        return result; // Считает сумму арифметической прогрессии
    }
}
