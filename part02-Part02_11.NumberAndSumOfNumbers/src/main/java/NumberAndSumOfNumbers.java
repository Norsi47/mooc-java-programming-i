
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //count inputed num
        int countNum = 0;
        int sumOfNumbers = 0;

        while (true) {
            System.out.println("Give a number: ");

            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
                
            } else if (userNum < 0) {
                countNum = countNum + 1;
                
            } else if (userNum > 0) {
                countNum = countNum + 1;
                
            }
            sumOfNumbers = sumOfNumbers + userNum;
            
        }

        System.out.println("Number of numbers: " +countNum + " Sum of the numbers: " + sumOfNumbers);

    }
}
