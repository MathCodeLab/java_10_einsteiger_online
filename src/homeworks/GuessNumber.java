package homeworks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();

        int secretNumber = myRandom.nextInt(0, 10);

        int MAX = 5;
        int count = 0;
        int input;

        while(count < MAX) { // 0, 1, 2, 3, 4
            input = myScanner.nextInt(); // enter a number: 3
            count++;
            // if secret_number == input -> break;
        }

        System.out.println(secretNumber);

    }
}
