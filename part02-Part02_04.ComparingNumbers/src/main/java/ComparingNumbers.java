
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum1 = Integer.valueOf(scanner.nextLine());

        int userNum2 = Integer.valueOf(scanner.nextLine());

        if (userNum1 > userNum2) {
            System.out.println(userNum1 + " is greater than " +userNum2);
            
        } else if (userNum1 < userNum2) {
            System.out.println(userNum1 + " is smaller than " +userNum2);
            
        } else {
            System.out.println(userNum1 + " is equal to " +userNum2);
        }

    }
}
