
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        Integer intAge = Integer.valueOf(scan.nextLine());

        if (intAge < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }
}
