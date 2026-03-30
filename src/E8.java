//Exercise 8 — Password Strength Checker:
//Create E8.java.
// Declare int passwordLength = 12 and boolean hasUppercase = true, boolean hasNumber = true, boolean hasSpecialChar = false.
// Using && and || operators, determine: if the password is "strong" (length >= 12 AND has all three),
// "medium" (length >= 8 AND has at least two of three), or "weak" (anything else).
// Print the strength level. Also print the password length as a byte
// — can it hold it? And print passwordLength as a char — what character does it show?

public class E8 {
    public static void main(String[] args) {
        int passwordLength = 12;
        boolean hasUpperCase = true;
        boolean hasNumber = true;
        boolean hasSpecialChar = false;
        int counter = 0;

        if (hasUpperCase)
            counter++;
        if (hasNumber)
            counter++;
        if (hasSpecialChar)
            counter++;

        if (passwordLength >= 12 && counter == 3) {
            System.out.println("Strong");

            byte passwordByteLength = (byte)passwordLength;
            System.out.println(passwordByteLength);

            char passwordChar = (char)(passwordLength);
            System.out.println(passwordChar);
        }
        else if ((passwordLength >= 8) && counter >= 2) {
            System.out.println("Medium");

            byte passwordByteLength = (byte)passwordLength;
            System.out.println(passwordByteLength);

            char passwordChar = (char)(passwordLength);
            System.out.println(passwordChar);

        }
        else {
            System.out.println("Weak");
        }
    }
}
