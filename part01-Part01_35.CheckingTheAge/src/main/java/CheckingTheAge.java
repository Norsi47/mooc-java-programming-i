
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you? ");
        Integer inputAge = Integer.valueOf(scan.nextLine());
        if ( inputAge >= 0 && inputAge <= 120) {
            System.out.println("Ok");
            
        } else {
            System.out.println("Impossible");
        }

    }
}
