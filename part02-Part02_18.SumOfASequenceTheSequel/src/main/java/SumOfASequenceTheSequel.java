
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int secondNum = Integer.valueOf(scanner.nextLine());

        int sumOfNum = 0;

        if (firstNum < secondNum) {
            for (int i = firstNum; i <= secondNum; i++) {
                sumOfNum = sumOfNum + i;

            }
            
        }
        System.out.print("The sum is: " +sumOfNum);



    }
}
