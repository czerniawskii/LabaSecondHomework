package org.example.thirdHomeWork;

public class StaticStaff {

    private static int staticVariable = 1;

    static {

        staticVariable = 216;
        System.out.println("Static block executed. Static variable initialized to " + staticVariable);

    }

    public static void showUsStaticVariable() {

        System.out.println("Static variable is " + staticVariable);
    }
}
