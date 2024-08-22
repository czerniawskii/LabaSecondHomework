package org.example.thirdHomeWork;

import org.example.thirdHomeWork.interfaces.IRefuel;

public class GasolineStation implements IRefuel {
    private String adress;
    private int fullChargePrice;

    public GasolineStation(){};

    public GasolineStation(String adress, int fullChargePrice){
        this.adress = adress;
        this.fullChargePrice = fullChargePrice;
    }

    public GasolineStation(int fullChargePrice){
        this.fullChargePrice = fullChargePrice;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getFullChargePrice() {
        return fullChargePrice;
    }

    public void setFullChargePrice(int fullChargePrice) {
        this.fullChargePrice = fullChargePrice;
    }

    @Override
    public void refuelGasolineCar() {
        System.out.println("Your car has been refueled");
    }


}
