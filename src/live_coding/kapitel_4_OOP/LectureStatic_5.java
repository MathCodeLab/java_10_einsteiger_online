package live_coding.kapitel_4_OOP;

class House{
    int roomNumbers;
    static String country;

    void printHi_normal(){
        System.out.println("hi");
    }

    static void printHi_static(){
        System.out.println("hi");
    }
}




class Dog{
    int roomNumbers;
    static String country;
    static void printHi_static(){
        System.out.println("jello ");
    }
}




public class LectureStatic_5 {
    int roomNumbers;
    static String country;

    static void printHi_static(){
        System.out.println("bybye hi");
    }



    public static void main(String[] args) {

        System.out.println(House.country);
        System.out.println(Dog.country);
        System.out.println(LectureStatic_5.country);
         System.out.println(House.);
        // System.out.println(country);



        House.printHi_static();
        Dog.printHi_static();
        LectureStatic_5.printHi_static();
        printHi_static();




        House.country = "iraq";


        House baneenHouse = new House();
        baneenHouse.roomNumbers = 1;
//        baneenHouse.country = "iraq";
        baneenHouse.printHi_normal();


        House serinHouse = new House();
        serinHouse.roomNumbers = 2;
//        serinHouse.country = "germany";
        House.country = "germany";
        serinHouse.printHi_normal();


        House yasserHouse = new House();
        yasserHouse.roomNumbers = 3;
//        yasserHouse.country = "syria";
        House.country = "syria";



        House sarahHouse = new House();
        sarahHouse.roomNumbers = 4;
//        sarahHouse.country = "denmark";
        House.country = "denmark";

        Dog.country = "Tom&Jerry";





        System.out.println(baneenHouse.roomNumbers); // 1
//        System.out.println(baneenHouse.country); // denmark
        System.out.println(House.country); // denmark
        System.out.println("------------------");

        System.out.println(serinHouse.roomNumbers); // 2
//        System.out.println(serinHouse.country); // denmark
        System.out.println(House.country); // denmark
        System.out.println("------------------");

        System.out.println(yasserHouse.roomNumbers); // 3
//        System.out.println(yasserHouse.country); // denmark
        System.out.println(House.country); // denmark
        System.out.println("------------------");

        System.out.println(sarahHouse.roomNumbers); // 4
//        System.out.println(sarahHouse.country); // denmark
        System.out.println(House.country); // denmark


    }
}
