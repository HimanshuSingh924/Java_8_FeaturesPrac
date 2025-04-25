package hs.consumer.biconsumer;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {


        BiConsumer<Integer, String> consumer = (x, y) -> {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        };
        consumer.accept(4, String.valueOf(9));
    }
}
