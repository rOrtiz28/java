//Exercise 2 — Unit Converter:
//Create UnitConverter.java. Declare an int with your weight in pounds (218). Convert it to kilograms (divide by 2.205).
//Store the result in an int and in a long.
//Print both. Is any information lost? Why? Now cast it explicitly to short and to byte. What happens to the number?

public class E2 {
    public static void main(String[] args) {
        int myWeight = 218;
        double convertToKg = 218 / 2.205;
        int result = (int) convertToKg;
        long resultL = (long) convertToKg;
        byte resultB = (byte) convertToKg;
        short resultS = (short) convertToKg;

        System.out.println(result);
        System.out.println(resultL);
        System.out.println(resultB);
        System.out.println(resultS);

        System.out.println(convertToKg);
        // The values go round because the int, long dont store decimals
    }
}
