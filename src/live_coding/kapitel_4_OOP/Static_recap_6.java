package live_coding.kapitel_4_OOP;

class Human{
    static int x1 = 2;
    int x2 = 1;

    // static method
    public static void printHello(){
        System.out.println("Hello");
        System.out.println(Human.x1);
        // System.out.println(x2);
    }

    // method
    public void printGoodbye(){
        System.out.println("GoodBye");
        System.out.println(Human.x1);
        System.out.println(x2);
    }
}


public class Static_recap_6 {
    // attributs
    static int x1 = 2;
    int x2 = 1;

    // static method
    public static void printHello(){
        System.out.println("Hello");
    }

    // method
    public void printGoodbye(){
        System.out.println("GoodBye");
    }

    // main method
    public static void main(String[] args) {
        int y = 5;
        System.out.println(y);

        int x1 = 7;
        System.out.println(x1);
        System.out.println(Static_recap_6.x1); // static attribure (variable)

        Static_recap_6 static_recap_6_obj = new Static_recap_6();
        System.out.println(static_recap_6_obj.x2); // not static attribure (variable)


        Static_recap_6.printHello(); // static method
        static_recap_6_obj.printGoodbye(); // not static method

        System.out.println(Human.x1);
        Human.printHello();

        Human human1 = new Human();
        Human human2 = new Human();

        System.out.println(human1.x2);
        human1.printGoodbye();

        System.out.println(human2.x2);
        human2.printGoodbye();

        System.out.println(Human.x1);


    }
}
