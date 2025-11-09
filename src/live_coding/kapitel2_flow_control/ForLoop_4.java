package live_coding.kapitel2_flow_control;

public class ForLoop_4 {
    public static void main(String[] args) {
        // if - else  // switch
        // while  // for

        int MAX = 10;

        int count1 = 0;
        while(count1 < MAX) {
            System.out.println(count1 + " hello java");
            count1++;
        }

        for(int count = 0; count < MAX; count++){
            System.out.println(count + " hello java");

        }

    }
}
