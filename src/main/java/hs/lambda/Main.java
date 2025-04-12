package hs.lambda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MathOperation sum =  (int a, int b) -> { return b + a; };
        MathOperation sum1 = (a, b) -> (a + b);
        MathOperation sum2 = Integer::sum;

        System.out.println(sum.operation(1, 2));
        System.out.println(sum1.operation(2,3));
        System.out.println(sum2.operation(3,4));
    }
}
