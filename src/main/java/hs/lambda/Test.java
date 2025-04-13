package hs.lambda;

import java.util.ArrayList;

public class Test {
    public static void test(){


        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        number.forEach(n -> {
            System.out.println(n);               // both way SOP statement are same
        });
        number.forEach(System.out::println);
    }
}
