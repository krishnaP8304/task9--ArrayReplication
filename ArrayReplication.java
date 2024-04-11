import java.util.Scanner;

public class ArrayReplication {
    public static void main(String[] args) {
        replicateElement();
    }

    public static void replicateElement() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter the size of the array
            System.out.print("Enter the size of an array: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Array size should be positive");
                return;
            }

            // Initialize an array of strings to store user input elements
            String[] array = new String[size];

            // Prompt user to enter the array elements
            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.next();
            }

            // Prompt user to enter the position (0-based index) to replicate the element
            System.out.print("Enter the position of the element to be replicated: ");
            int position = scanner.nextInt();

            if (position < 0 || position >= size) {
                System.out.println("Array index is out of range");
                return;
            }

            // Get the element at the specified position
            String elementToReplicate = array[position];

            // Resize the array to accommodate the replicated element
            String[] newArray = new String[size + 1];

            // Copy elements to the new array
            System.arraycopy(array, 0, newArray, 0, size);

            // Insert the replicated element at the end of the new array
            newArray[size] = elementToReplicate;

            // Display the updated array
            System.out.print("Array after replication: [");
            for (int i = 0; i < newArray.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(newArray[i]);
            }
            System.out.println("]");

        } catch (Exception e) {
            System.out.println("Input was not in the correct format");
        } finally {
            scanner.close();
        }
    }
}
