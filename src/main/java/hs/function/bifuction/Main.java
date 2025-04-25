package hs.function.bifuction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {


        BiFunction<String,String, Integer> function = (x, y) -> (x.concat(y)).length();
        System.out.println("function = " + function.apply("Hello ","India!"));
    }
}
