
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = 0;
        double averageNum = 0;
        int userSum = 0;

        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {

                break;
                
            }

            if (userInput > 0) {
                countNum = countNum + 1;
                userSum = userSum + userInput;
                averageNum = (double) userSum / countNum;
                
            }
            if (userInput < 0) {
                continue;
                
            }

        }
        if (countNum == 0) {
            System.out.println("Cannot calculate the average");
            
        } else {
            System.out.println(averageNum);
            

        }

    }
}
