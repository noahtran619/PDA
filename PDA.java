import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        int age;
        int LOWER_BOUND = 14;
        boolean shouldContinue = true;
        double NOT_WHOLE = 0.5;
        while (shouldContinue) {
            System.out.println("How old are you?(Typing 0 will turn off the program)");
            try {
                age = scanner.nextInt();
                int LOWEST_AGE = (age / 2) + 7;
                int HIGHEST_AGE = (age - 7) * 2;
                if (age == 0) {
                    shouldContinue = false;
                    System.out.println("Goodbye!");
                } else if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else if (age%2 !=0) {
                    System.out.println(LOWEST_AGE + 1 + " is the lowest age you can date");
                    System.out.println(HIGHEST_AGE + " is the highest age you can date");
                } else {
                    System.out.println(LOWEST_AGE + " is the lowest age you can date");
                    System.out.println(HIGHEST_AGE + " is the highest age you can date");
                }
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter an integer");
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

