package org.example.thirdHomeWork;

import org.example.thirdHomeWork.lambda.*;
import org.example.thirdHomeWork.lambda.StudentComparator;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {



        //9th homework

        //Create 3 functional interfaces

        IMultiplicate iMultiplicate = (a, b) -> a * b;
        System.out.println("Result is " + iMultiplicate.multiply(6, 66));

        IStringFormater toLowerCaseFormatter = str -> str.toLowerCase();
        System.out.println(toLowerCaseFormatter.format("TRULALA I AM SPEAKING WITH VERY BIG CAPITAL LETTERS!!!"));

        IExtract iExtract = (c, d) -> c - d;
        System.out.println("Extraction gives " + iExtract.minus(100, 100));


        // Create 3 custom Lambda functions with generics.

        IMerge<String> stringIMerge = (e, g) -> e + " " + g;
        System.out.println("Merged Strings: " + stringIMerge.merge("This is first String", "And this is another, completely separated String"));

        ITransform<Integer, String> intToString = (input) -> "The number is " + input;
        System.out.println(intToString.transform(666));

        ITransform<String, Integer> stringLength = (input) -> input.length();
        System.out.println("String length is: " + stringLength.transform("AVADAKEDAVRA"));

        IComparate<Integer> integerIComparate = (x, z) -> Integer.compare(x, z);
        System.out.println("Comparison result is " + integerIComparate.compare(300, 200));


        //Create 3 complex Enums(with fields, methods, blocks).

        double daysInYears;
        for (Planet planet : Planet.values()){
            System.out.println(planet.name() + " turns around Sun in " + planet.daysToYears() + " years.");
        }

        for (Zodiac zodiac : Zodiac.values()){
            System.out.println("Ruler of " + zodiac.name() + " is " + zodiac.getRulingPlanet());
        }

        for (Houses house : Houses.values()) {
            System.out.println(house);
        }





        //Extra hometask
        //Use at least 5 lambda functions from the java.util.function package.








        /*


        public void selectBattery(Battery battery){
            switch (battery) {
                case LOW_POWER:
                    System.out.println("low");
                case HIGH_POWER:
                    System.out.println("high");

            }
        }


        for (CCs cCs:
             CCs.values() ){
            System.out.println(cCs.getTitle());
            System.out.println(cCs.getDescription());
          System.out.println("============");

        }




        CCs.VISA.getTitle();

        List<Student> k = new ArrayList<>();
        k.stream().filter(x -> x.age>18).map(y -> y.name).toList();



        ICalculate z = (g, h) -> g + h;
        System.out.println(z.add(25, 48));

        ICalculate p = (q, w) -> q - w;
        System.out.println(p.add(10, 10));

        Comparator<Student> lambdaInt = (x, y) -> x.age - y.age;
        Comparator<Student> lambdaString = (v, w) -> v.name.compareTo(w.name);

        Set<Student> o = new TreeSet<Student>(lambdaInt);
        Set<Student> f = new TreeSet<Student>(lambdaString);

    }

    public void doSmth(ICalculate iCalculate){

        iCalculate.add(12, 23);
    }
*/

        /*
        //8th homework

        File shakespear = new File("src/main/java/org/example/thirdHomeWork/shakespear.txt");

        String fileToString = FileUtils.readFileToString(shakespear, StandardCharsets.UTF_8);

        String[] allWords = fileToString.toLowerCase().split("\\W+");

        Set<String> uniqueWords = new HashSet<>();

        for (String word : allWords) {

            if (!word.trim().isEmpty()) {
                uniqueWords.add(word);
            }
        }

        String summary = "\nThe numbers of the unique words is " + uniqueWords.size();

        FileUtils.writeStringToFile(shakespear, summary, StandardCharsets.UTF_8, true);

        System.out.println(summary);

    }
}







        // 6th Homework - re doing it


    String[] b = new String[8];
    int[] c = new int [10];
    List<String> a = new ArrayList<>();
    a.add("First");
    List<Integer> d = new ArrayList<>();

    List<Student> students = new ArrayList<>();
    Student student1 = new Student("Piotr", 22);
    Student student2 = new Student("Anna", 33);
    students.add(student1);
    students.add(student2);
        System.out.println(students);
    students.size();
    students.get(0);
    students.remove(1);


    // Set - hashset, linked hashset, treeset

        //hashset (unsorted)

        Set<Student> set = new HashSet<>();
        set.add(new Student("Ivan", 20));
        set.add(new Student("Ivan", 20));
        System.out.println(set);

        for (int i = 0; i<100; i++) {
            set.add(new Student("Max" + i, i));
            System.out.println(set);
        }

        //linked hashset (sorted - insertion order)

        Set<Student> setL = new LinkedHashSet<>();

        for (int g = 100; g>0; g--) {
            setL.add(new Student("Maxi" + g, g));
            System.out.println(setL);
        }


        //treeset - sorted (need to implement order)

        Set<Student> setT = new TreeSet<>();
        for (int t = 1000; t>900; t--){
            setT.add(new Student("Luna" + t, t));
            System.out.println(setT);
        }


        // Comparator

        StudentComparator stuComp = new StudentComparator();
        Set<Student> setX = new TreeSet<>(stuComp);
        for (int h = 0; h<27; h++){
            setT.add(new Student("Seth" + h, h));
            System.out.println(stuComp);
        }


        // Queue - sorted

        Queue<String> q = new PriorityQueue<>();
        q.add("C");
        q.add("B");
        q.add("A");


        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);


        //Stack - unsorted

        Stack<String> s = new Stack<>();
        s.add("X");
        s.add("XX");
        s.add("XXX");
        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);


        // Map

        Map<String, Integer> z = new HashMap<>();
        z.put("First", 1);
        z.put("Second", 2);
        z.put("Third", 3);
        z.put("First", 108);
        System.out.println(z);


        // custom LinkedList

        CustomLinkedList<Mercedes> list = new CustomLinkedList<>();
        list.add(new Mercedes("Dany", 2009));
        list.add(new Mercedes("Helen", 2024));
        list.add(new Mercedes("Artsiom", 1990));

        System.out.print("CustomLinkedList: ");
        list.printList();
    }

*/


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


    }}