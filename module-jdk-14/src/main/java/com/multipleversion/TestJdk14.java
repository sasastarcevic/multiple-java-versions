package com.multipleversion;

public class TestJdk14 {

    public TestJdk14(Object obj) {
        if (obj instanceof String s) {      // instanceof, cast and bind variable in one line.
            if ("jdk14".equalsIgnoreCase(s)) {
                System.out.println("Equals");
            } else {
                System.out.println("Not Equals");
            }
        } else {
            System.out.println("Not a string");
        }
    }

}
