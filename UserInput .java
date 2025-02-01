// Name: Akhil Chivukula
// PRN: 23070126009
// Batch: AIML - A1

import java.util.Scanner;

class UserInput {
    Scanner scan = new Scanner(System.in);

    // Get input for two numbers
    int[] getTwoNumbers() {
        int[] numbers = new int[2];
        System.out.println("Enter the first number: ");
        numbers[0] = scan.nextInt();

        System.out.println("Enter the second number: ");
        numbers[1] = scan.nextInt();

        return numbers;
    }

    // Get input for a single number
    int getSingleNumber() {
        System.out.println("Enter a number: ");
        return scan.nextInt();
    }

    // Get input for an array
    int[] getArrayInput() {
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }
}
