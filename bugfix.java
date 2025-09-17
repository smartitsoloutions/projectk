public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length; // Bug: division by zero possible & integer division truncation
    }

    public static void main(String[] args) {
        int[] numbers = {}; // Empty array leads to exception
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }
}

