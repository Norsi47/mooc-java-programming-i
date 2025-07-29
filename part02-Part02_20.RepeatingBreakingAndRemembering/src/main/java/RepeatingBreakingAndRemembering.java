
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sumNum = 0;
        double averageNum = 0;
        int evenNum = 0;
        int oddNum = 0;
        System.out.println("Give numbers:");
        while (true) {

            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == -1) {
                System.out.println("Thx! Bye!");
                break;
                
            } else {
                // also count = count + userNum
                sumNum += userNum;


                //keeps track of numbers inputed
                count++;
            }

            averageNum = (double)sumNum / count;

            if (userNum % 2 ==0) {
                evenNum++;
                
            } else {
                oddNum++;
            }


        } 
        System.out.println("Sum: "+sumNum);
        System.out.println("Numbers: " +count);
        System.out.println("Average: " +averageNum);
        System.out.println("Even: "+ evenNum);
        System.out.println("Odd: " + oddNum);




    }
}
