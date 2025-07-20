
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number: ");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;

            }
            sumOfNumbers = sumOfNumbers + userNum;

        }
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }
}
