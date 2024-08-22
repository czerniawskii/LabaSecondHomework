package org.example.thirdHomeWork;
import org.example.thirdHomeWork.interfaces.*;


public class Main {
    public static void main(String[] args) {



       //4th HomeWork

        TeslaX newTesla = new TeslaX();
        newTesla.beep();
        newTesla.doSmth();

        Mercedes newMercedes = new Mercedes();
        newMercedes.beep();
        newMercedes.doSmth();

        IBeep TeslaS = new TeslaX();
        TeslaS.beep();
        TeslaS.doSmth();

        TeslaS = new Mercedes();
        TeslaS.beep();
        TeslaS.doSmth();


        TeslaX car01 = new TeslaX();
        Car car02 = new TeslaX();
        IBeep car03 = new TeslaX();


        StaticStaff iAmStatic = new StaticStaff();
        iAmStatic.showUsStaticVariable();

        ThisIsFinalClass iAmFinal = new ThisIsFinalClass();
        iAmFinal.showMeFinalIntValue();




        //3rd HomeWork

       /* Car teslaCar = new TeslaX("Max", 2022);

        Transport mercedes = new Mercedes("Magda", 2024);

        mercedes.speedUp();
        teslaCar.speedUp();

        */



        /* 2nd HomeWork:

        Driver firstDriver = new Driver("Max", 100);


        ElectricCarChargerStation shell = new ElectricCarChargerStation(50);

        GasolineStation orlen = new GasolineStation(110);


        if(firstDriver.getCashAmount() >= shell.getFullChargePrice()) {
            System.out.println("You can charge your Tesla at Shell station");} else {
            System.out.println("You need more money to charge your Tesla at Shell station");
        }

        if(firstDriver.getCashAmount() >= orlen.getFullChargePrice()) {
            System.out.println("You can fuel your Mercedes at Orlen station");} else {
            System.out.println("You need more money to fuel your Mercedes at Orlen station");
        }
*/


    }




    }
