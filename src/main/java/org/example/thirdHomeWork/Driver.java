package org.example.thirdHomeWork;

public class Driver {
    private String driversName;
    private int cashAmount;

    public Driver(){}

    public Driver(String driversName, int cashAmount){
       this.driversName = driversName;
       this.cashAmount = cashAmount;

    }

    public String getDriversName() {
        return driversName;
    }

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }
}
