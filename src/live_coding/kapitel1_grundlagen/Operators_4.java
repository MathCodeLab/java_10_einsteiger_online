package live_coding.kapitel1_grundlagen;

public class Operators_4 {
    public static void main(String[] args) {





        // datatypes
        int x = 5;
        boolean y1 = true;
        boolean y2 = false;


        // Operators
        // 1. arthemetic: nummeric
        // +    -     *    /     %
        //----------------------------
        int num1 = 7;
        int num2 = 9;
        int result = num1 + num2;
        System.out.println(num1 + num2);

        // 2. Assignment (Zuweisungsoperatoren): nummeric
        //  =        +=  -=   *=    /=        ++ --
        //----------------------------------
        int z = 2;
        System.out.println(z); // 2
        z = 4;
        System.out.println(z); // 4
        z = 6;
        System.out.println(z); // 6

        z = z + 2;
        System.out.println(z); // 8

        z += 2; // 10
        System.out.println(z); // 10

        z++; // 11
        System.out.println(z); // 11

        String firstname = "serin";
        int s = 7;
        String myVar = firstname + s; // "serin5"
        System.out.println(myVar);

        String lastname = "java";
        String firstAndLastname = firstname + " " + lastname;
        System.out.println(firstAndLastname);
        System.out.println(firstname + " " + lastname);


        // 3. Relational operators: nummeric
        // <    >    <=      >=       ==      !=
        //---------------------------------------
        boolean bannenLikesJava = true;
        boolean a = 5 < 7;

        boolean result1 = 1 < 10; // True
        boolean result2 = 1 > 10; // False
        boolean result3 = 1 <= 10; // True
        boolean result4 = 1 >= 10; // False
        boolean result5 = 1 == 10; // False
        boolean result50 = 10 == 10; // true
        boolean result6 =      1 != 10; // True


        // 4. Logical Operator: boolean (true, false)
        // java:   &              !
        // python: and     or       not
        int     t =   6   +  5;
        boolean result7 = false & false; // false
        boolean result8 = false & true; // false
        boolean result9 = true & false; // false
        boolean result10 = true & true; // true


        boolean result11 = false || false; // false
        boolean result12 = false || true; // true
        boolean result13 = true  || false; // true
        boolean result14 = true  || true; // true

        boolean result15 = !true; // false

        // --------------------
        System.out.println(true & (4 < t) & (false || true));
        System.out.println(true & 4 < t & false  || true);

        System.out.println(  true & false  || false  );
        System.out.println( 5 + 6 * 2);

        System.out.println( (true & false) || false);







    }
}
