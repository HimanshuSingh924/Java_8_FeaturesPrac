package hs.lambda;

public class Main {
    public static void main(String[] args) {

        MathOperation sub =  (int a, int b) -> { return b - a; };
        MathOperation sum = (a, b) -> (a + b);
        MathOperation sum1 = Integer::sum;

        System.out.println(sub.operation(1, 2));
        System.out.println(sum.operation(2,3));
        System.out.println(sum1.operation(3,4));

        Test.test();
    }
}
