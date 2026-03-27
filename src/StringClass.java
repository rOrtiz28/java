public class StringClass {
    public static void main(String[] args) {
        String myString = "Hello World";
        System.out.println(myString);

        String myString2 = "1";
        int myInteger = Integer.parseInt(myString2);
        System.out.println(myInteger);

        double myDouble = Double.parseDouble(myString2);
        System.out.println(myDouble);

        String concatenatedString = myString + " " + myInteger;
        System.out.println(concatenatedString);

        String concatenatedString2 = myString + 1 + 10 + myInteger;
        System.out.println(concatenatedString2);
    }
}
