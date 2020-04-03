package com.multipleversion;

import javax.validation.Valid;
import java.util.function.IntFunction;

public class TestJdk8 {

    public TestJdk8() {
        IntFunction<Integer> doubleIt1 = (@Valid final int x) -> x * 2;   // Compiles since Java 8

        // IntFunction<Integer> doubleIt2 = (@Valid final var x) -> x * 2;   // Will compile from Java 11

        System.out.println("TestJdk8: " + doubleIt1.apply(5));
    }

}
