
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        //ask user
        System.out.println("Give a number: ");
        double floatingNum = Double.valueOf(scanner.nextLine());

        //print number
        System.out.println("You gave the number " +floatingNum);


    }
}
