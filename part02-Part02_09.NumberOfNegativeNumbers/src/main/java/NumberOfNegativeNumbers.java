
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;

            }
            if (userNum > 0) {
                continue;

            } else if (userNum < 0) {
                countNum = countNum + 1;

            }

        }
        System.out.println("Number of negative numbers: " + countNum);

    }
}
