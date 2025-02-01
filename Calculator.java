
// Name: Akhil Chivukula
// PRN: 23070126009
// Batch: AIML - A1

class Calculator {
    int[] num; // Stores two numbers for operations

    // Constructor to initialize numbers
    public Calculator() {
        UserInput in = new UserInput();
        this.num = in.getTwoNumbers(); // Takes input once and stores in num
    }

    // Function to perform addition
    int addition() {
        return num[0] + num[1];
    }

    // Function to perform subtraction
    int subtraction() {
        return num[0] - num[1];
    }

    // Function to perform multiplication
    int multiplication() {
        return num[0] * num[1];
    }

    // Function to perform division (handling division by zero)
    double division() {
        if (num[1] == 0) { 
            System.out.println("Division by zero is not allowed. Returning 0 as the result.");
            return 0;
        }
        return (double) num[0] / num[1];
    }

    // Function to generate Fibonacci sequence up to n terms
    void fibonacci(int n) {
        int a = 0, b = 1, sum;
        System.out.print("Fibonacci sequence: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }

        System.out.println();
    }

    // Function to calculate the mean of an array
    void mean(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println("Mean is: " + (sum / array.length));
    }

    // Function to calculate the variance of an array
    void variance(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }

        double mean = sum / array.length;
        double sumSquaredDiffs = 0;

        for (int num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }

        System.out.println("Variance is: " + (sumSquaredDiffs / array.length));
    }

    // Function to calculate the standard deviation of an array
    void standardDeviation(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }

        double mean = sum / array.length;
        doub
