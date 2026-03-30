// Exercise 7 — Paycheck Calculator:
//Create E7.java. Declare double hoursWorked = 42.5 and double hourlyRate = 25.50.
// Calculate gross pay. If hours exceed 40, the extra hours are paid at 1.5x rate (overtime).
// Use an if/else to determine if overtime applies. Print the result with a descriptive message.
// Also print: the gross pay cast to int (to show cents lost),
// whether the worker earned over $1000 using a boolean, and the pay as a short — does it fit?

public class E7 {
    public static void main(String[] args) {
        double hoursWorked = 34.4;
        double hourlyRate = 25.50;

//      double overtime = hoursWorked - 40;
        double totalPay = 0;

        if (hoursWorked >= 40) {
            double overtimeHrs = hoursWorked - 40;
            totalPay = ((hourlyRate * 1.5) * overtimeHrs) + (40 * hourlyRate);
            System.out.println("Total pay double: " + totalPay);

            short totalShort = (short) totalPay;
            System.out.println("Total pay short: " + totalShort);

            int lostCents = (int) totalPay;
            System.out.println("Lost cents: " + lostCents);

            boolean more1k = totalPay >= 1000;
            System.out.println("more 1k: " + more1k);

        }
        else if (hoursWorked < 40) {
            totalPay = hoursWorked * hourlyRate;
            System.out.println("Total pay double: " + totalPay);

            short totalShort = (short) totalPay;
            System.out.println("Total pay short: " + totalShort);

            int lostCents = (int) totalPay;
            System.out.println("Lost cents: " + lostCents);

            boolean more1k = totalPay >= 1000;
            System.out.println("more 1k: " + more1k);
        }

    }
}
