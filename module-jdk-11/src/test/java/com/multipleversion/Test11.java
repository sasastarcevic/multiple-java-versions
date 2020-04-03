package com.multipleversion;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test11 {

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
    public void testJdk11() {
        System.out.println("Test JDK 11");
        System.out.println("");

        TestJdk11 testJdk11 = new TestJdk11();
    }

}