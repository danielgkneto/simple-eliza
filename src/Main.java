import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String answer;
        boolean quit = false;
        System.out.println("\nWelcome to Simple Eliza");

        while (quit == false) {
            System.out.println("\nWhat is your problem? ");
            answer = kb.nextLine();

            if ((answer.equalsIgnoreCase("I am feeling great")) || (answer.equalsIgnoreCase("q"))){
                quit = true;
            }
        }
        System.out.println("\nThank you for your time.");
    }
}