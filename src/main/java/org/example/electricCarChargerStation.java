package org.example;

public class electricCarChargerStation {
    private String adress;
    private int fullChargePrice;

    public electricCarChargerStation() {
    };
    public electricCarChargerStation(String adress, int fullChargePrice){
        this.adress = adress;
        this.fullChargePrice = fullChargePrice;
    }

    public electricCarChargerStation(int fullChargePrice){
        this.fullChargePrice = fullChargePrice;
    }
/*
    public boolean canTheDriverPayTheBill(){
        if (fullChargePrice >= driver.cashAmount){
            System.out.println("You can charge your car here");
        } else {
            System.out.println("You need more money");
*/



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
