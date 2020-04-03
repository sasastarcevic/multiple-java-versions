package com.multipleversion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test14 {

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
    public void testJdk14() {
        System.out.println("Test JDK 14");
        System.out.println("");

        TestJdk14 testJdk = new TestJdk14("jdk14");

        TestJdk14 testJdk2 = new TestJdk14("jdk16");

        TestJdk14 testJdk3 = new TestJdk14(1);
    }

}