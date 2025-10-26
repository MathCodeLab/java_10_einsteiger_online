package live_coding.kapitel2_flow_control;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop_2 {
public static void main(String[] args) {

    System.out.println("Guess a number between 1 and 10!");
    Random myRandom = new Random();
    int randomNumber = myRandom.nextInt(1, 11);
    //System.out.println(randomNumber);


    int trials = 3;
    System.out.println("You have " + trials + " trials!");
    int count = 1;

    while (count <= trials) {

        Scanner myscanner = new Scanner(System.in);
        int inputNumber = myscanner.nextInt();
        //System.out.println(inputNumber);


        if (inputNumber == randomNumber) {
            System.out.println("you win");
            break;
        }

        else {
            System.out.println("false .. try again!");
        }

        count++;

    }


    System.out.println("Bye");



//        int count = 0;
//        while (count < 5){
//            System.out.println(count + " hallo");
//            count++;
//        }



}
}
