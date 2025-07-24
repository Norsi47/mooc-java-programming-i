
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int userNum = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from? ");
        int userNum2 = Integer.valueOf(scanner.nextLine());

        if (userNum2 <= userNum) {
            for (int i = userNum2; i <= userNum; i ++) {
                System.out.println(i);

            }


            
        }





        





    }
}
