package org.example.thirdHomeWork.interfaces;

public interface IDrive {

    void driving();

    default void whatICanDo1() {
        System.out.println("I can drive");
    }
}
