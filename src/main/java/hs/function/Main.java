package hs.function;

// Function :- to work for you anything
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> douInt = x -> x * 2;
        Function<Integer, Integer> triInt = x -> x * 3;

        System.out.println(douInt.andThen(triInt).apply(10));
        System.out.println(douInt.compose(triInt).apply(10));

//        return same value as you pass in apply method without any change
        final Function<Object, Object> identity = Function.identity();
        final Integer identApply = (int) identity.apply(10);

        System.out.println(identApply);

        System.out.println(douInt.toString());
    }
}