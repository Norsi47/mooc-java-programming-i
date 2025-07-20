
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum < 0) {
                System.out.println("Unsuitable number");

                
            }

            if (userNum > 0) {
                System.out.println(userNum * userNum);
                
            }            
            if (userNum == 0) {
                break;
                
            }


            
        }

    }
}
