
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String userString = String.valueOf(scan.nextLine());

        //integer
        System.out.println("Give an integer: ");
        Integer userInteger = Integer.valueOf(scan.nextLine());


        //double or floating-point number
        System.out.println("Give a double: ");
        Double userDouble = Double.valueOf(scan.nextLine());

        //boolean
        System.out.println("Give a boolean: ");
        Boolean userBoolean = Boolean.valueOf(scan.nextLine());

        //print out result
        System.out.println("You gave the string " +userString);
        System.out.println("You gave the integer "+userInteger);
        System.out.println("You gave the double " +userDouble);
        System.out.println("You gave the boolean "+userBoolean);


    }
}
