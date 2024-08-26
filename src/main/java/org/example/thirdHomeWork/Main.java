package org.example.thirdHomeWork;

import java.util.Scanner;


public class Main {

    //5th Homework

    // approach TRY-CATCH

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        doSmth(a);
    }

    public static void doSmth(int a) {
        if (a<0)
            try {
                throw new MyExceptions("My exceptions");
            } catch (MyExceptions e) {
                throw new RuntimeException(e);
            }
        System.out.println("Continue...");
    }



    //approach THROWS

    public void anotherException() throws MyExceptions {
    Scanner scanner2 = new Scanner(System.in);
    int b = Integer.parseInt(scanner2.next());
    doSmthElse(b);
    }

    public static void doSmthElse (int b) throws MyExceptions {

        if (b>0)
            throw new MyExceptions("My exceptions");

}

    //approach Try-catch with resources


    public void tryCatchWithResources() {

        try (Scanner scanner3 = new Scanner(System.in);) {
            {
                throw new MyExceptions("My exceptions");
            }
        } catch (MyExceptions e) {
            throw new RuntimeException(e);
        }
    }











        // Create 5 custom exceptions


        // Handle exceptions in 2 ways.
        // 1 way = method throws...
        // 2 way = try/catch

        //Use try-catch with resources.

/*
        try {
            FileReader fileReader = new FileReader("org/example/thirdHomeWork/test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All is good");

        // OR

        try { FileReader fileReader2 = new FileReader("org/example/thirdHomeWork/test.txt");
         } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } System.out.println("All is good");

*/




       //4th HomeWork

        /*
        try { TeslaX newTesla = new TeslaX();
        newTesla.beep();
        newTesla.doSmth(); } catch (IndexOutOfBoundsException e) {System.err.println("IndexOutOfBoundsException: " + e.getMessage());}

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

*/


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




