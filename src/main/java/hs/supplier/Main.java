package hs.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Supplier<String> supplyString = () -> "Happy Boy!";
        System.out.println(supplyString.get());
    }
}
