package live_coding.kapitel2_flow_control;

public class While_repeat_3 {
    public static void main(String[] args) {
        // if - else
        // while - for
        // example: print "hello java" 10 times
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("hello java");
        System.out.println("-----------");
//      Edge case / randfall
//        ---------------
//        if (BOOLEAN){
//            System.out.println("you are allowed to enter the cinema");
//        }
        int count = 1;
        while (count <= 10) {
            System.out.println(count + " hello java");
            count++; // count = count + 1 // count+=1
        }






    }
}
