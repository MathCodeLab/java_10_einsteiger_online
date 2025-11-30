package live_coding.kapitel_4_OOP;

class Person {
    // attributes or variables
    String name; // declare
    int score;
    float length;
    int age;
}

class Car {
    String model;
    int maxSpeed;
    double price;
    String color;
}

public class IntroToClasses_1 {

    public static void printHi(){
        System.out.println("hi");
    }

    public static void main(String[] args) {

        int x = 5;
        int y = 7;

        int[] myArr1 = new int[5]; // arrays with 5 int elements
        String[] myAr2 = new String[5]; // arrays with 5 String el
        // ements
        String[] names = {"serin", "sara",  "baneen", "yasser"};
        int[] scores = {10, 100, 1000, 1};
        float[] lengths = {12.3f, 14.2f, 17.2f, 9.2f};
        int[] ages = {24, 22, 23, 24};


        // name, score, length, age
//        Person person1 = new Person(name="serin", score=10, length=12.3f, age=24); // person1 is an object from data type Person
//        Person person2 = {name="sara", score=100, length=14.2f, age=22}; // person2 is an object from data type Person
//        Person person3 = {name="baneen", score=1000, length=17.2f, age=23}; // ...
//        Person person4 = {name="yasser", score=1, length=19.2f, age=24};
//        Person person5 = {name="yasser", score=1, length=19.2f, age=24, color="brown"}; // XXXXX ERROR!!! color is not defined and thus not allowed
//
//        // model, maxSpeed, price, color
//        Car car1 = {model="bmw", maxSpeed=240, price=100.2, color="black"}; // car1 is an object from data type Car
//        Car car2 = {model="skoda", maxSpeed=230, price=80.5, color="green"}; // car2 is an object from data type Car
//        Car car3 = {model="", maxSpeed=0, price=0.0, color=""};






    }
}
