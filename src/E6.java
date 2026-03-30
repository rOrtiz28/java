//Exercise 6 — Type Detective:
//Create E6.java.
//Declare the following variables: int num = 127, double price = 19.99, char letter = 'Z', boolean isActive = true.
// Print each one with its type name (e.g., "int: 127"). Then: cast num to byte and print the result. Cast num + 1 (128) to byte and print the result.
// Cast price to int and print what gets lost.
// Print the Unicode value of letter as an int.
// Combine everything into one String using concatenation and print it.

public class E6 {
    public static void main(String[] args) {
        int num = 127;
        double price = 19.99;
        char letter = 'Z';
        boolean isActive = true;

        System.out.println("int: " + num);
        System.out.println("double: " + price);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isActive);

        byte numB = (byte) num;
        System.out.println("byte num value: " + numB);

        byte numBB = (byte)(numB + 1);
        System.out.println("byte num + 1: " + numBB); // overflow

        int priceD = (int) price;
        System.out.println("int price: " + priceD); // rounded value, lost .99

        int letterCode = 'Z';
        System.out.println("char code: " + letterCode);

        String joinAll = "All:" + (num + priceD) + letter + isActive + letterCode;
        System.out.println("joinAll: " + joinAll);

    }
}
