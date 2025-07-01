import java.util.Scanner;

public class messageTesting {

    public static void main(String[] args) {
        //scan message
        Scanner scanner = new Scanner(System.in);

        //Type message here
        System.out.println("Type message here");

        //variable to store message
        String messageHere = scanner.nextLine();

        System.out.println("1: " + messageHere);
        System.out.println("2: " + messageHere);
        System.out.println("3: " + messageHere);
    }
    
}
