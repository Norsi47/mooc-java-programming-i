
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter first string: ");
        String userInput1 = scan.nextLine();

        System.out.println("Enter second string: ");
        String userInput2 = scan.nextLine();

        if (userInput1.equals(userInput2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        


        
    }
}
