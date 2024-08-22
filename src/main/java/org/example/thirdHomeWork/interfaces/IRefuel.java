package org.example.thirdHomeWork.interfaces;

public interface IRefuel {

    void refuelGasolineCar();

    default void whatICanDo3() {
        System.out.println("I can refuel your gasoline car");
    }
}
