package live_coding.kapitel_3_additional_Topics;

public class Casting_Division_Modulo_3 {
    public static void main(String[] args) {

        // Ascending order: small to large
        // byte, short, int, long,   float, double

        // Descending order: large to small
        // double, float,  long, int, short, byte

        int mohammad = 4;
        double baneen = 4.3;

        // implicit casting (automatically)
        baneen = mohammad; // from int to double (small to large)
        System.out.println(baneen); // 4.0


        int serin = 6;
        double yasser = 7.3;

        // explicit casting (manually)
        serin = (int) yasser; // from double to int (large to small)
        System.out.println(serin); // 7

        int x1 = 5;
        int x2 = (int) 5.6; // 5

        double x3 = 7.2;
        double x4 = 7; // 7.5

        short x5 = 8;
        long x6 = 8;

        x5 = (short) x6;
        x6 = x5;
        System.out.println(x5);
        System.out.println(x6);

        // Division
        System.out.println("------------");
        System.out.println(5 * 3); // 15
        System.out.println(5 * 3.0); // 15
        int x7 = 3;
        double x8 = 2.5;
        double x9 = x7 * x8; // 7.5

        int y1 = 3;
        double y2 = 2.0;
        double y3 = y1 * y2; // 6.0 // int * double


        System.out.println(9 * 2); // 18
        System.out.println(2.5 * 3); // 7.5

        // int / int => int
        System.out.println(9 / 2);  // 4:
        System.out.println(9.0 / 2); // 4.5
        System.out.println(9 / 2.0); // 4.5
        System.out.println(9.0 / 2.0); // 4.5

        int y4 = 9 / 2;
        double y5 = 9.0 / 2;

        // ----------
        System.out.println("----------------");
//        System.out.println(7 / 1); // 7
        // The rest of dividing 7 by 1 is 0
        System.out.println(7 % 1); // 0
        System.out.println(7 % 2); // 1
        System.out.println(7 % 3); // 1
        System.out.println(7 % 4); // 3
        System.out.println(7 % 5); // 2
        System.out.println(7 % 6); // 1
        System.out.println(7 % 7); // 0

        System.out.println(7 % 8); // 7
        System.out.println(7 % 9); // 7
    }
}
