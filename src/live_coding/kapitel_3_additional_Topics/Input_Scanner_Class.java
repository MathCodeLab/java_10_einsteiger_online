package live_coding.kapitel_3_additional_Topics;

import java.util.Scanner;

public class Input_Scanner_Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();


        if (age > 12    &   age < 60){
            System.out.println("You are allowed to enter.");
            System.out.println("Your age is " + age);

        }
        else {
            System.out.println(" XXXX You are NOT allowed XXXX");
        }




    }
}
