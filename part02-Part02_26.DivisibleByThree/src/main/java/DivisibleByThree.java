
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {

        divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange (int beginning, int end) {
        //loop to keep track of # and print multi numbers
        for (int i = beginning; i<=end; i++) {
            // if staement for moduler and == 0 for no remainder
            if (i % 3 == 0 ) {
                //print out the # divisibl by three
                System.out.println(i);
                
            }

        }

    }

}
