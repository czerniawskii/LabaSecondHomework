package org.example.thirdHomeWork.interfaces;

public interface IRecharge {

    void rechargeElectroCar();

    default void whatICanDo2() {
        System.out.println("I can recharge your electrocar battery");
    }
}
