package hs.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Predicate --> functional interface( boolean valued function )
        Predicate<Integer> isEven = x -> x % 2 == 0; // here an condition store in
        System.out.println(isEven.test(18));              // variable : functional programming

        Predicate<String> isStartWithA = str -> str.toLowerCase().startsWith("a");
        String string = "Ankit";
        System.out.println(isStartWithA.test(string));
        System.out.println(isStartWithA.test(string) ? "Yes Start with A" : "No, Not Start with A");

        //combining two prdicate of isStartWithA and isEndWithT
        Predicate<String> isEndWithT = str -> str.toLowerCase().endsWith("t");
        final Predicate<String> and = isStartWithA.and(isEndWithT);
        System.out.println(and.test(string));
    }
}
