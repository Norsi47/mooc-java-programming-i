
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int userSum = 0;
        double userAverage = 0;
        int countNum = 0;        

        while (true) {

            System.out.println("Give a number: ");

            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
                
            } else if (userNum < 0) {
                countNum = countNum +1;
                
            } else if (userNum > 0) {
                countNum = countNum +1;
                
            }
            userSum = userSum + userNum;
            userAverage = (double) userSum / countNum;

            
        }

        System.out.println("Average of the numbers: " + (userAverage));

    }
}
