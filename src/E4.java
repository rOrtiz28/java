//Exercise 4 — Mini Calculator:
//Create MiniCalculator.java. Declare two int variables with values of your choice.
//Calculate and print: addition, subtraction, multiplication, division, and modulus (%).
//Print each result with a descriptive message. Bonus: What happens if you divide by 0?

public class E4 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        int resultAdd = number1 + number2;
        System.out.println("Sum result: " + resultAdd);

        int resultSub = number1 - number2;
        System.out.println("Subtract result: " + resultSub);

        int resultMult = number1 * number2;
        System.out.println("Multiplication result: " + resultMult);

        int resultDiv = number2 / number1;
        System.out.println("Division result: " + resultDiv);

        int resultMod = number1 % number2;
        System.out.println("Modulus result: " + resultMod);

//        int resultDiv2 = number1 / 0;
//        System.out.println("Division result: " + resultDiv2);
    }
}
