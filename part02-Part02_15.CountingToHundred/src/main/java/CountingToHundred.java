
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userNum = Integer.valueOf(scanner.nextLine());

        for (int i = userNum; i < 101; i++) {
            System.out.println(i);
            
        }

    }
}
