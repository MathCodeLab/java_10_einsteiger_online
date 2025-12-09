package live_coding.kapitel_4_OOP;

import java.util.Scanner;

class MyClassStudent {
    String name;
    String address;
    int age;
}

class Weather {
    double[] humedity;
    double temperature;
    double windSpeed;


    public static void printHi(){
        System.out.println("hi");
    }
}

public class IntroToClasses_2 {
    public static void main(String[] args) {

        // variable
        int x = 5;

        // --------------------
        // empty array
        int[] myArr1 = new int[3]; // {0, 0 ,0}
        int[] myArr2 = new int[3]; // {0, 0 ,0}

        // 4,8,6
        myArr1[0] = 4;
        myArr1[1] = 8;
        myArr1[2] = 6;

        myArr2[0] = 5;
        myArr2[1] = 7;
        myArr2[2] = 9;


        // or, array with already known values
        int[] weight = {56, 22, 23};

        // --------------------
        MyClassStudent myObject_Student1 = new MyClassStudent();
        myObject_Student1.name = "yasser";
        myObject_Student1.address = "Germany, Hamburg";
        myObject_Student1.age = 20;

        MyClassStudent myObject_Student2 = new MyClassStudent();
        myObject_Student2.name = "sara";
        myObject_Student2.address = "Denmark, Kolding";
        myObject_Student2.age = 19;

        MyClassStudent myObject_Student3 = new MyClassStudent();
        myObject_Student3.name = "Baneen";
        myObject_Student3.address = "Germany";
        myObject_Student3.age = 20;

        // ...
        // ...

        //

        Scanner myScanner = new Scanner(System.in); // sensor input!

        // create app with arrays
        double temp = 0.0;
        double hu = 0.0;
        double wi = 0.0;
        double[] temperatures = new double[7];
        double[] humedities = new double[7];
        double[] windSpeeds = new double[7];

        for (int day = 0; day < 7; day++) {
            temp = myScanner.nextDouble(); // temperature sensor measuremnt
            hu = myScanner.nextDouble(); // humedity sensor measuremnt
            wi = myScanner.nextDouble(); // wind speed sensor measuremnt
            temperatures[day] = temp;
            humedities[day] = hu;
            windSpeeds[day] = wi;
        }


//        // alternative: create app with objects
//        Weather weatherObj1 = new Weather();
//
//        for (int day = 0; day < 7; day++){
//            weatherObj1.temperature[day] = myScanner.nextDouble(); // temperature sensor measuremnt
//            weatherObj1.humedity[day] = myScanner.nextDouble(); // humedity sensor measuremnt
//            weatherObj1.windSpeed[day] = myScanner.nextDouble(); // windSpeed sensor measuremnt
//        }
//






        //-----------------------------
        String[] studentNames = new String[2]; // [null, null]
        String[] studentAdsresses = new String[2]; // [null, null]
        int[] studentAges = new int[2]; // [0, 0]

        studentNames[0] = "sarah";
        studentNames[1] = "yasser";
        // studentNames[2] = "Baneen"; --> ERROR!!!!

        studentAdsresses[0] = "Denmark";
        studentAdsresses[1] = "Germany";

        studentAges[0] = 20;
        studentAges[1] = 23;



    }
}
