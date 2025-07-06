
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        Integer firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        Integer secondNum = Integer.valueOf(scanner.nextLine());

        //do the math
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));

        //subtract
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));

        //multiply
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));

        //divide
        System.out.println(firstNum + " / " + secondNum + " = " + (double) firstNum / secondNum);



    }
}
