package live_coding.kapitel_3_additional_Topics;

public class Methods_recap_6 {

    // no param, no return
    public static void printHi() {
        System.out.println("Hi");
    }

    // params, no return
    public static void printName(String firstName, String lastName){
        System.out.println("Welcome " + firstName + " " + lastName);
    }

    // no params, return
    public static double testFixedAverage(){
        int num1 = 3;
        int num2 = 4;
        int num3 = 15;
        int sum = num1 + num2 + num3;
        double average = (double) sum / 3;

        System.out.println(average);
        return average;
    }

    // params, return
    public static double testAverage(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        double average = (double) sum / 3;

        System.out.println(average);
        return average;
    }



    public static void main(String[] args) {
        // call the methods
        printHi();
        printHi();
        printHi();

        printName("Serin", "al serin");
        printName("mohamm", "al mohammad");
        printName("bannen", "al bannen");

        String fristname1 = "baneen";
        String lastname2 = "al bannen";
        printName(fristname1, lastname2);
        printName(fristname1, "sara");

        double avg1 = testAverage(2, 9, 5);
        double avg2 = testAverage(3, 6, 8);
        double avg3 = testAverage(5, 9, 10);
        double avg4 = testAverage(3, 6, 8);


        double sumOfAverages = avg1 + avg2 + avg3 + avg4;
        System.out.println("Suum of averages: " + sumOfAverages);


        double avg5 = testFixedAverage();
        double avg6 = testFixedAverage();
        double avg7 = testFixedAverage();
        double avg8 = testFixedAverage();


        double sumOfAverages2 = avg5 + avg6 + avg7 + avg8;
        System.out.println("Suum of averages: " + sumOfAverages2);


    }
}
