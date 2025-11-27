package live_coding.kapitel_3_additional_Topics;

import java.util.Scanner;

public class Arrays_4 {
    public static void main(String[] args) {

        // declear and initialise
        int x = 5;

        // declear / deklarieren   <-> define / definieren
        int y;

        // initialise / intialiseren <-> first value
        y = 5;
        System.out.println(y); // 5

        // override / ueberschreiben
        y = 100;
        System.out.println(y); // 100

        // declear and initialise
        int[] arr1 = {14, 32, 55, 26};
        System.out.println(arr1[0]); // access / zugriff
        System.out.println(arr1[1]);
        System.out.println(arr1[2]); // 55
        System.out.println(arr1[3]);
        // System.out.println(arr1[4]); // error

        arr1[2] = 100; // access / zugriff
        System.out.println(arr1[2]); // 100

        String[] arr2 = {"hi", "java"};

        int[] arr3;
//        arr3 = {7,5,32,2};


//        -----------------
        // new way to create arrays
        int[] arr5 = {343, 34, 5 ,4};

        System.out.println("=======");
        int[] arr4 = new int[6]; // reserve 6 elements

        System.out.println(arr4[0]); // 0
        System.out.println(arr4[1]); // 0
        System.out.println(arr4[2]); // 0
        System.out.println(arr4[3]); // 0
        System.out.println(arr4[4]); // 0
        System.out.println(arr4[5]); // 0

        arr4[0] = 1;
        arr4[1] = 3;
        arr4[2] = 5;
        arr4[3] = 7;
        arr4[4] = 9;
        arr4[5] = 11;

        System.out.println(arr4[0]); // 1
        System.out.println(arr4[1]); // 3
        System.out.println(arr4[2]); // 5
        System.out.println(arr4[3]); // 7
        System.out.println(arr4[4]); // 9
        System.out.println(arr4[5]); // 11


        System.out.println("===========================");
        // sudoku
        int[] serinArr = new int[9];
        // manual intialisation
        serinArr[0] = 5;
        serinArr[1] = 3;
        serinArr[4] = 7;

        // user input
        Scanner serinScanner = new Scanner(System.in);
        serinArr[2] =  serinScanner.nextInt();
        serinArr[3] =  serinScanner.nextInt();
        serinArr[5] =  serinScanner.nextInt();
        serinArr[6] =  serinScanner.nextInt();
        serinArr[7] =  serinScanner.nextInt();
        serinArr[8] =  serinScanner.nextInt();

        System.out.println(serinArr[0]);
        System.out.println(serinArr[1]);
        System.out.println(serinArr[2]);
        System.out.println(serinArr[3]);
        System.out.println(serinArr[4]);
        System.out.println(serinArr[5]);
        System.out.println(serinArr[6]);
        System.out.println(serinArr[7]);
        System.out.println(serinArr[8]);

    }
}
