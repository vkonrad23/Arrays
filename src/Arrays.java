import java.util.Scanner;

public class ArrayMethods {

    public static int[] inputArray(int length) {
        // Create an empty array
        int[] array = new int[length];

        // Get user input for each element of the array
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = new Scanner(System.in).nextInt();
        }

        return array;
    }

    public static int[] createRandomArray(int length) {
        // Create an empty array
        int[] array = new int[length];

        // Generate random values for each element of the array
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        return array;
    }

    public static void printArray(int[] array) {
        // Print the array in user friendly way
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int sumOfArrayElements(int[] array) {
        // Calculate and print sum of the array using loop
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int largestValueInArray(int[] array) {
        // Find the largest value of an array
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int searchValueInArray(int[] array, int value) {
        // Create a variable to store the index of the searched value
        int index = -1;

        // Iterate over the array
        for (int i = 0; i < array.length; i++) {
            // If the searched value is found, update the index variable
            if (array[i] == value) {
                index = i;
                break;
            }
        }

        // Return the index of the searched value
        return index;
    }

    public static void main(String[] args) {
        // Ask user to create an array
        System.out.print("Enter array length: ");
        int length = new Scanner(System.in).nextInt();

        // Create an array using method 1
        int[] array = inputArray(length);

        // Print the array using method 2
        printArray(array);

        // Calculate and print sum of the array using method 3
        int sum = sumOfArrayElements(array);
        System.out.println("Sum of array elements: " + sum);

        // Find the largest value of the array using method 4
        int largest = largestValueInArray(array);
        System.out.println("Largest value in array: " + largest);

        // Search a value in the array using method 5
        System.out.print("Enter value to search: ");
        int value = new Scanner(System.in).nextInt();
        int index = searchValueInArray(array, value);
        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at index: " + index);
        }
    }
}

