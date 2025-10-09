package live_coding.kapitel1_grundlagen;

public class Operators_3 {
    public static void main(String[] args) {

        // Variablen
        // ---------

        // Deklarieren (declare)
        // Dfiniere (define)
        // Erstelle (create)
        int x1;

        // Initialsiseren (initialise) zum ersten mal, for the first time
        x1 = 11;
        System.out.println(x1); // 11

        // Ueberscreiben (override)
        x1 = 7;
        System.out.println(x1); // 7

        // Declare + initialise in one line
        int y1 = 4;



        // Operatoren  - Operators
        // Numbers & boolean
        // 1. arethemtic operators
        // + - * / %
        int x = 9;
        int y = 4;

        int sum = x + y;
        int mult = x * y;
        int sub = x - y;


        System.out.println(sum);
        System.out.println(mult);
        System.out.println(sub);

        // System.out.println(6 * 7); // 42

        // rundklammer , round brakets
        int l = 4;
        int b = 3;
        int area_rechteck = (l * b);

        int r = 3;
        double circle = 3.14 * (r*r);

        double totalArea1 = (area_rechteck + circle);
        System.out.println(totalArea1);


        // double totalarea2 = (l * b) + (3.14 * r * r);
        double totalArea2 = l * b + 3.14 * r * r;
        System.out.println(totalArea2);

        System.out.println("======================");




        // 2. assignment operators
        // =
        // +=      -=     /=        */
        // ++      --

        // declare and intialise
        int s = 3;
        System.out.println(s); // 3


        // override
        s = 4;
        System.out.println(s); // 4

        // override
        s = s + 10; // 4 + 10 ----> 14
        System.out.println(s); // 14


        int z = 5;

        // z + 2
        // ----> 5 + 2
        // ----> 7
        z += 2;   // z = z + 2


        int e = 7;
        System.out.println(e); // 7


        // e = e + 1;
        // e += 1
        e++; // 8
        System.out.println(e); // 8


    }
}