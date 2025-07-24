
import java.util.Scanner;

public class MyTesting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int stopNum = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from? ");
        int startNum = Integer.valueOf(scanner.nextLine());

        if (startNum <= stopNum) {
            for (int i = startNum; i <= stopNum; i++) {
                System.out.println(i);

            }

        } else {
            System.out.println("Invalid syntax");
        }

    }
}
