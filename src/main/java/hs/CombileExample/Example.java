package hs.CombileExample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {


        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> integerFunction = x -> x * x;
        Consumer<Integer> integerConsumer = x -> System.out.println(x);
        Supplier<Integer> integerSupplier = () -> 100;

        if (integerPredicate.test(integerSupplier.get())) {
            integerConsumer.accept(integerFunction.apply(integerSupplier.get()));
        }

    }
}
