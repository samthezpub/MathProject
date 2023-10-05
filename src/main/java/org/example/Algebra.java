package org.example;

import java.lang.reflect.Array;

public class Algebra {
    public static Double[] getQuadraticEq(double a, char z1, double b, char z2, double c){
        double D = b * b - (4 *a*c);

        double x1 = (-b - Math.sqrt(D))/(2*a);
        double x2 = (-b + Math.sqrt(D))/(2*a);

        Double[] result = new Double[2];
        if (D == 0){
            result[0] = x1;
            return result;
        }
        if (D > 0){
            result[0] = x1;
            result[1] = x2;
            return result;
        }
        else {
            throw new RuntimeException("Корней нет!");
        }

    }
}
