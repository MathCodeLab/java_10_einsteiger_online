package live_coding.kapitel_4_OOP;

class JavaStudent {
    String name; // class attribute
    int age; // class attribute
    double cost; // class attribute

    public void printAttributes(){
    }
}

// class
class Goods {
    float price = 0.99f; // class attribue
    String type; // class attribute
    char color;
    int size;
    int length;

    // empty constructor : special method
    Goods(){
    }

    // constructor with 1 arg : special method
    Goods(String type){
        this.type = type;
    }

    // constructor with 1 arg : special method
    Goods(int size){
        this.size = size;
    }

    // constructor with all args : special method
    Goods(float price, String type, char color, int size){
//        System.out.println(myPrice); // 100
//        System.out.println(price); // 0.99
//        System.out.println(myType); // jeans
//        System.out.println(type); // null

        this.price = price;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public void printAttributes (String location){
        System.out.println(this.type + ": " + price + " in " + location); // T-shirt: 30 in Germany
    }

    public void reducePrice(){
        float reduncedPrice = this.price / 2;
        price = reduncedPrice;
//        price = price / 2;
    }
}


public class Methods_Constructor_3 {
    static int globalX = 1; // global variable / class attribute

    public static int printHallo(int mohammad){ // class method
        System.out.println("Hi java!");
        System.out.println(mohammad);
        int yasser = 500; // local variable

        System.out.println(globalX);

        return yasser;
    }
    public static void printGoodBye(int mohammad, int[] arr){ // class method
        System.out.println(mohammad);
        System.out.println("Bye java!");
        System.out.println(globalX);
    }

    public static void main(String[] args) { // main method
        // create 2 objects from class JavaStudent
        JavaStudent javaStudentObj1 = new JavaStudent();
        JavaStudent javaStudentObj2 = new JavaStudent();

        // create object1
        Goods goodsObj1 = new Goods();


        // print empty goodsObj1
        System.out.println(goodsObj1.price); // 0.99
        System.out.println(goodsObj1.type); // null
        goodsObj1.printAttributes("Germany"); // null: 0.0 in Germany

        // fill out goodsObj1
        goodsObj1.price = 10.0f;
        goodsObj1.type = "T-Shirt";

        // print the filled-out goodsObj1
        System.out.println(goodsObj1.price); // 10.0
        System.out.println(goodsObj1.type); // T-shirt
        goodsObj1.printAttributes("Germany"); // Tshirt: 10.0 in Germany


        // reduce price
        goodsObj1.reducePrice(); // price 10 -> 5
        System.out.println("Price after first reducing: " + goodsObj1.price); // 5

        goodsObj1.reducePrice(); // price 5 -> 2.5
        System.out.println("Price after second reducing: " + goodsObj1.price); // 2.6

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        // create a new object of class Goods
        Goods goodsObj2 = new Goods(100, "jeans", 'R', 30); // create object1

        System.out.println(goodsObj2.price); // 100
        System.out.println(goodsObj2.type); // jeans
        goodsObj2.price = 1000;
        goodsObj2.printAttributes("Denmark"); // null: 0.0 in Denmark
//        goodsObj2.price = 100;
//        goodsObj2.type = "jeans";
//        goodsObj2.color = 'R';
//        goodsObj2.size = 30;


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Goods goodsObj3 = new Goods("skirt");
        System.out.println(goodsObj3.type); // skirt
        System.out.println(goodsObj3.price); // 0.99
        System.out.println(goodsObj3.size); // 0

        Goods goodsObj4 = new Goods(5);


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        int mohammad = 100; // local variable
        int yasser = printHallo(mohammad); // local variable
        System.out.println(globalX);

        int[] arr1 = {134, 23, 32};
        int[] arr2 = new int[3];
        arr2[0] = 0;
        arr2[1] = 1;
        arr2[2] = 2;
        printGoodBye(mohammad, arr1);
        printGoodBye(mohammad, arr2);
    }


}
