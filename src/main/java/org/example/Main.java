package org.example;

public class Main {
    public static void main(String[] args) {


        Driver firstDriver = new Driver("Max", 100);

        TeslaX teslaCar = new TeslaX("Max", 2022);

        Mercedes mercedes = new Mercedes("Max", 2024);

        electricCarChargerStation shell = new electricCarChargerStation(50);

        GasolineStation orlen = new GasolineStation(110);


        if(firstDriver.getCashAmount() >= shell.getFullChargePrice()) {
            System.out.println("You can charge your Tesla at Shell station");} else {
            System.out.println("You need more money to charge your Tesla at Shell station");
        }

        if(firstDriver.getCashAmount() >= orlen.getFullChargePrice()) {
            System.out.println("You can fuel your Mercedes at Orlen station");} else {
            System.out.println("You need more money to fuel your Mercedes at Orlen station");
        }


    }
}