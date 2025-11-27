package live_coding.kapitel_3_additional_Topics;

public class Mathods_5 {


    // 4 kinds of methods:
    // -------------------
    // 1. without parameters, but without return
    // 2. without parameters, but with return
    // 3. with parameters, but without return
    // 4. with parameters, but with return




    // method definition
    // without parameter
    public static void bag (){

    }



    // method definition
    // without parameter
    public static void laptop(){

    }


    // method definition
    // without parameters
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
//        int sara = 6;
//        System.out.println(yasser);
//        System.out.println(count);
    }

    // with parameter / argument
    public static void printHelloYasser(int count){
        for(int i = 0; i < count; i++){
            System.out.println("hello yasser");
        }
        System.out.println("--------------------");
    }

    public static void printHelloNameMultiTimes(int count, String name){
        for (int i = 1; i <= count; i++) {
            System.out.println(i + ". Hello " + name);
        }
        System.out.println("****************");
    }


    public static double printRectangleArea(int length, double width){
        double area = length * width;
        // System.out.println(area);
        return area;
    }

    public static void main(String[] args) {
        // activation for the methods -> calling a method (aufrufen)
        printHelloWorld(); // 10x
        printHelloWorld(); // 10x
        printHelloWorld(); // 10x

        System.out.println("-----");

        printHelloYasser(5); // 3X
        printHelloYasser(7); // 7X
        printHelloYasser(9); // 9X
        printHelloYasser(2); // 2X

        System.out.println("00000000000");
        System.out.println("00000000000");
        System.out.println("00000000000");
        System.out.println("00000000000");

        int count1 = 5;
        String name1 = "serin";
        printHelloNameMultiTimes(count1, name1); // 5serin


        int count2 = 7;
        String name2 = "yasser";
        printHelloNameMultiTimes(count2, name2); // 7 yasser


        printHelloNameMultiTimes(2, "sara"); // 2 sara
        printHelloNameMultiTimes(4, "baneen"); // 4 baneen
        printHelloNameMultiTimes(1, "mohammad"); // 1 mohammmad

        // rectangle = rechteck
        System.out.println("==============");
        double area1 = printRectangleArea(7, 3.2); // rectangle 1
        double area2 = printRectangleArea(8, 4.4); // rectangle 1
        double area3 = printRectangleArea(11, 5.1); // rectangle 1
        double area4 = printRectangleArea(5, 2.2); // rectangle 1

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println(area4);


        // compute average (mean) across all rectangles areas - durchschnitt
        double averageAreas = (area1 + area2 + area3 + area4) / 4;

    }
}
