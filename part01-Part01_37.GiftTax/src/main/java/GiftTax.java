
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        Integer userInput = Integer.valueOf(scan.nextLine());

        if (userInput < 5000 ) {
            System.out.println("No Tax!");
        } else if (userInput <= 25000) {
            System.out.println( "Tax: " +(100 + (userInput - 5000 ) * 0.08 ));
            
        } else if (userInput <= 55000) {
            System.out.println("Tax: " +(1700 + (userInput - 25000) * 0.10 ) );
            
        } else if (userInput <= 200000 ) {
            System.out.println("Tax: " + (4700 + (userInput - 55000) * 0.12 ));
            
        } else  if (userInput <= 1000000) {
            System.out.println("Tax: " + (22100 + (userInput - 200000 ) * 0.15) );
            
        } else  {
            System.out.println("Tax: " + (142100 + (userInput - 1000000) * 0.17 ));
            
        }

    }
}
