package org.example.thirdHomeWork;

public class GasolineStation {
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
}
