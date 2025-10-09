package live_coding.kapitel1_grundlagen;

public class Datatypes_2 {
    public static void main(String[] args) {

        // Variable
        // --------
        // 1. data type: int
        // 2. name: x
        // 3. literal (wert/value): 2
        int x = 2;

        char medizinTech = 'M';
        String program = "erst vorlesung"; // first lecture
        float laenge = 4.596F; // length 32 bit: 6-7 number after comma
        double pi = 3.1473464563; // 64 bit // 15-16

        // allocate, 7-8 Bln
        long views = 50000000;
        int deutschlandBewohner = 83000000; //

        // print
        System.out.println("views"); // views
        System.out.println(50000000); // 50000000
        System.out.println('$'); // $
        System.out.println(views); // 50000000

        // -32768 bis 32767
        short bankAccount = -32768;

        String lamp1 = "on";    // off
        int lamp2 = 1;          // 0
        boolean lamp3 = true;   // false

    }
}