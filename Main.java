// Name: Akhil Chivukula
// PRN: 23070126009
// Batch: AIML - A1

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        UserInput input = new UserInput();

        int choice;
        do {
            // Displaying menu for user selection
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Mean of Array");
            System.out.println("7. Variance of Array");
            System.out.println("8. Standard Deviation of Array");
            System.out.println("9. Exit");

            choice = input.getSingleNumber(); // Get user's choice

            switch (choice) {
                case 1:
                    System.out.println("Sum is: " + cal.addition());
                    break;
                case 2:
                    System.out.println("Difference is: " + cal.subtraction());
                    break;
                case 3:
                    System.out.println("Product is: " + cal.multiplication());
                    break;
                case 4:
                    System.out.println("Quotient is: " + cal.division());
                    break;
                case 5:
                    cal.fibonacci(input.getSingleNumber());
                    break;
                case 6:
                    cal.mean(input.getArrayInput());
                    break;
                case 7:
                    cal.variance(input.getArrayInput());
                    break;
                case 8:
                    cal.standardDeviation(input.getArrayInput());
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 9);
    }
}
