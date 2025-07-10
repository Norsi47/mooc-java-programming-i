
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give speed: ");
        Integer varSpeed = Integer.valueOf(scanner.nextLine());

        if ( varSpeed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
