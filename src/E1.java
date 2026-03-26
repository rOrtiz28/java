//Exercise 1 — Overflow Explorer:
//Create OverflowExplorer.java. Declare a byte with Byte.MAX_VALUE and add 1 to it.
//Do the same with short and int. Print the results. What happens? Why?
//Write your answer as a comment in the code.

public class E1 {
    public static void main(String[] args) {
        byte maxByte = Byte.MAX_VALUE;
        byte mByte = (byte) (maxByte + 1);
        System.out.println(mByte);
        // Overflow - happens when the computer tries to accommodate in memory
        // It goes to a complete cycle

        short maxShort = Short.MAX_VALUE;
        short mShort = (short) (maxShort + 1);
        System.out.println(mShort);

        int maxInt = Integer.MAX_VALUE;
        int mInt = (int) (maxInt + 1);
        System.out.println(mInt);
    }
}
