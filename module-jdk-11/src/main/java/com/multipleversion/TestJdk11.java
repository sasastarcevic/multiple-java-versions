package com.multipleversion;

import javax.validation.Valid;
import java.util.function.IntFunction;

public class TestJdk11 {

    public TestJdk11() {
        // IntFunction<Integer> doubleIt1 = (@Valid final int x) -> x * 2;   // Compiles since Java 8

        // We are using 'var' instead of 'int'
        IntFunction<Integer> doubleIt2 = (@Valid final var x) -> x * 2;   // Will compile from Java 11

        System.out.println("TestJdk11: " + doubleIt2.apply(5));
    }

}
