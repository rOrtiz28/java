public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        // This is a comment
        char firstChar = 'a';
        System.out.println(firstChar);
        char secondChar = 'a';
        System.out.println(secondChar);

        int multiply = 4 * 4;
        multiply++; //Post-fix operator
        multiply--;
        multiply += 10;
        System.out.println(multiply);
        int divide = 8 / 4;
        System.out.println(divide);
//        int divideByZero = 8 / 0;
//        System.out.println(divideByZero);

        int remainder = 8 % 4;
        System.out.println(remainder);

        int result2 = 10;
        result2 -= 3.2222; //compound assignment  operator (int) (result2 -3.2222)
        System.out.println(result2);

        double result3 = 3.22;
        result3 *= 5;
        System.out.println(result3);

        double result4 = 3.22;
        result4 /= 5;
        System.out.println(result4);

    }
}
