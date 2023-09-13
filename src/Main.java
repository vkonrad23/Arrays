import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        {
            // Create an array with predefined size
                int[] numbers = new int[10];

                // Create an array with size defined in a variable
                int size = 5;
                int[] otherNumbers = new int[size];

                // Create a literal array
                String[] names = {"John", "Jane", "Peter", "Mary"};

                // Create an array of doubles
                double[] doubles = {1.2, 3.4, 5.6, 7.8};

                // Create an array of characters
                char[] chars = {'a', 'b', 'c', 'd'};

                // Create an array of booleans
                boolean[] booleans = {true, false, true, false};

                // Set and access array elements by index
                numbers[0] = 10;
                numbers[1] = 20;
                numbers[2] = 30;

                System.out.println("5th element value: " + numbers[4]);

                // Demonstrate error of accessing array element by non-existing index
                // This will cause an ArrayIndexOutOfBoundsException
                System.out.println("1000th element value: " + numbers[1000]);

                // Iterate over array (array traversal)
                // Using for loop
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }

                // Using enhanced for loop
                for (int value : numbers) {
                    System.out.println(value);
                }

                // Using while loop
                int i = 0;
                while (i < numbers.length) {
                    System.out.println(numbers[i]);
                    i++;
                }
            }
        }

    }
}