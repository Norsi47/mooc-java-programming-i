
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int userNum = Integer.valueOf(scanner.nextLine());

        int sumOfNum = 0;

        for (int i = 1; i <= userNum; i++) {

            sumOfNum = sumOfNum + i;

        }
        System.out.println("The sum is " + sumOfNum);

    }
}
