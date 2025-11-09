package homeworks;

import java.util.Scanner;

public class Coffee_order {
    public static void main(String[] args) {



        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to our coffee shop!");

        // enter name
        System.out.println("Enter your name?");
        String name =  myScanner.nextLine(); //string

        // enter coffee number
        System.out.println("Enter the number of coffee cups");
        int coffeeCupsNumber = myScanner.nextInt();
        // milk?
        System.out.println("Do you want milk? (true or false)");
        boolean milk = myScanner.nextBoolean();

        int milkCupsNumber = 0;

        if (milk){
            System.out.println("Enter number of milk cups: ");
            milkCupsNumber = myScanner.nextInt();
            System.out.println("Thanks! " + name + ". You ordered " + milkCupsNumber + " milk cups.");

        }
        else{
            System.out.println("You ordered without milk");
        }

        float coffeePreis = 2.5f;
        float milkPreis = 0.5f;

        float totalCoffeePreis = coffeeCupsNumber * coffeePreis; // coffee
        float totalMilkPreis = milkCupsNumber * milkPreis; // milk
        float totalPreis = totalCoffeePreis + totalMilkPreis;

        System.out.println("================================================");
        System.out.println("Thanks! " + name + ". You ordered " + coffeeCupsNumber + " coffee cups and " + milkCupsNumber + " milk cups");

        System.out.println("Total preis is: " + totalPreis);











        int x; // declaration
        x = 5; // initialisation
        x = 7; // override // uerberschreiben


        int x1 = 8; // declaration + initialisation
        x1 = 2; // override // uerberschreiben




//        System.out.println(4+2); // 6
//        System.out.println("4 + 2"); // 4+2
//        System.out.println("4" + "2"); // 42 // concatenation
//        System.out.println(4 + "2"); // 42
//        System.out.println("4" + 2); // 42
//
//        System.out.println(4 + 1 + "2"); // 52
//        System.out.println("4" + 2 + 1); // sorry it is not 43!!! it is: 421
//        System.out.println("1" + "4" + 2 + 1); // 1421
//        System.out.println(4 + 1 + "2" + 1 + 1); // 5211



//        Random myRandom1 = new Random();
//        int number = myRandom1.nextInt();
//        System.out.println(number);


    }
}
