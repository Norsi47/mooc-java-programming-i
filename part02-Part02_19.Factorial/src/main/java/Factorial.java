
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int factorialNum = 1;
        System.out.print("Give a number: ");
        int userNum = Integer.valueOf(scanner.nextLine());

        for(int i = factorialNum; i<=userNum; i++) {
            factorialNum = factorialNum * i;

        }

        System.out.print("Factorial: " +factorialNum);



    }
}
