package com.multipleversion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test8 {

    @BeforeAll
    public static void init() {
        System.out.println("");
        System.out.println("");
        System.out.println("#######################################################################################");
        System.out.println("");
    }

    @AfterEach
    public void finalize() {
        System.out.println("");
        System.out.println("#######################################################################################");
        System.out.println("");
        System.out.println("");
    }

    @Test
    public void testJdk8() {
        System.out.println("Test JDK 8");
        System.out.println("");

        TestJdk8 testJdk8 = new TestJdk8();
    }

}