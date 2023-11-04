import java.util.Scanner;

public class TaskTwo {

    public static void main (String[] args) {
        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);
        String user_name = scan.nextLine();
        System.out.println("Hello, " + user_name + "!");
    }

}
