
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]: ");
        Integer enterNum = Integer.valueOf(scan.nextLine());

        if (enterNum < 0) {
            System.out.println("Grade: impossible!");

        } else if (enterNum <= 49) {
            System.out.println("Grade: failed ");

        } else if (enterNum <= 59) {
            System.out.println("Grade: 1");

        } else if (enterNum <= 69) {
            System.out.println("Grade: 2");

        } else if (enterNum <= 79) {
            System.out.println("Grade: 3");

        } else if (enterNum <= 89) {
            System.out.println("Grade: 4");

        } else if (enterNum <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }

    }
}
