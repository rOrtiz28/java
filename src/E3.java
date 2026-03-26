//Exercise 3 — Casting Chain:
//Create CastingChain.java. Declare a long with value 50000.
//Cast it to int, then that int to short, then that short to byte.
//Print each step. Now do it with 200000. At what point does the value break and why?

public class E3 {
    public static void main(String[] args) {
        long myLong = 50000L;
        System.out.println(myLong);

        int myInt = (int) myLong;
        System.out.println(myInt);

        short myShort = (short) myInt;
        System.out.println(myShort); // breaks at this point

        byte myByte = (byte) myShort;
        System.out.println(myByte);

        long myLong2 = 200000L;
        System.out.println(myLong2);

        int myInt2 = (int) myLong2;
        System.out.println(myInt2);

        short myShort2 = (short) myInt2;
        System.out.println(myShort2); // breaks at this point

        byte myByte2 = (byte) myShort2;
        System.out.println(myByte2);

    }
}
