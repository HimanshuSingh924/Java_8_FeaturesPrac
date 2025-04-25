package hs.consumer;

// Consumer :- it consume something but not return anything
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<Integer> printInteger = (x) -> System.out.println(x);
        Consumer<String> printInteger1 = System.out::println;

        printInteger.accept(5);
        printInteger1.accept("Hello");

//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Consumer<List<Integer>> listConsumer = System.out::println;
        Consumer<List<Integer>> listConsumer = x -> {
            for (int i : x){
                System.out.print(i);
            }
        };

//        listConsumer.accept(list);
        listConsumer.accept(Arrays.asList(1,2,3,4,5));

    }


}
