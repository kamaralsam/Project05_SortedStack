import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

/**
 * A program that reads a list of integers from the user,
 * stores them in a Stack, sorts them in ascending order,
 * and prints the sorted numbers.
 */
public class SortedStack {

    /**
     * Main method that runs the program.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter integers (type 'done' to finish):");

        // Read integers and push onto the stack
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers.push(number);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done'.");
                }
            }
        }

        // Sort the stack in ascending order
        Collections.sort(numbers);

        // Print and pop each number from the stack
        System.out.println("Sorted Stack (smallest to largest):");
        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop() + " ");
        }

        scanner.close();
    }
}
