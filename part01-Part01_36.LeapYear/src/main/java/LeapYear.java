
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        Integer inputYear = Integer.valueOf(scan.nextLine());

        // divisible by 4 = leap year
        // same by 100 = leap year
        // same by 400 = leap year
        if ((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0)) {
            System.out.println("The year is a leap year.");

        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
