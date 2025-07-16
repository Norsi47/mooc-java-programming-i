
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum = Integer.valueOf(scanner.nextLine());

        int multiNum = userNum * -1;

        if (userNum < 0) {
            System.out.println(multiNum);
            
        } else {
            System.out.println(userNum);
        }

       

    }
}
