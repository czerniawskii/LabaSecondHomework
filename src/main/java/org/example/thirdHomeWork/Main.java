package org.example.thirdHomeWork;

import java.util.*;


public class Main {

    public static void main(String[] args) {



        // 6th Homework

    // 1. ArrayList
    ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList: " + arrayList);

    // 2. LinkedList
    LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("!");
        System.out.println("LinkedList: " + linkedList);

    // 3. HashSet
    HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(1.1);
        hashSet.add(2.2);
        hashSet.add(3.3);
        System.out.println("HashSet: " + hashSet);

    // 4. TreeSet
    TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        System.out.println("TreeSet: " + treeSet);

    // 5. PriorityQueue
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        System.out.println("PriorityQueue: " + priorityQueue);


    //6. LinkedList with generics

    TeslaX bigTesla = new TeslaX("Leon", 2000);
    LinkedList<TeslaX> carList = new LinkedList<TeslaX>();
    carList.add(bigTesla);
    System.out.println(carList);


    }


    //5th Homework

    /*

    // approach TRY-CATCH


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


*.
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




