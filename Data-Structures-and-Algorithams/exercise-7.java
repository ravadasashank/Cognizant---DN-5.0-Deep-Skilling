// Exercise 7: Forecasting Future Value Using Recursion
public class Exercise7 {

    // Recursive function to calculate future value
    public static double forecast(double amount, double rate, int years) {

        // Base case
        if (years == 0) {
            return amount;
        }

        // Recursive case
        return forecast(amount * (1 + rate / 100), rate, years - 1);
    }

    public static void main(String[] args) {

        double initialAmount = 10000;
        double growthRate = 10;   // 10%
        int years = 5;

        double futureValue = forecast(initialAmount, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f",
                years, futureValue);
    }
}

// Output: Future Value after 5 years = 16105.10
// Time Complexity: O(n) where n is the number of years
// Space Complexity: O(n) due to the recursive call stack
