public class PrimitiveTypes {
    public static void main (String[] args) {
        int myFirstNumber = Integer.MIN_VALUE;
        int mySecondNumber = Integer.MAX_VALUE;
        int myThirdNumber = 2_222_222;
        System.out.print(mySecondNumber + "\n");
        System.out.print(myFirstNumber + "\n");
        System.out.print("max integer value = " + mySecondNumber + "\n");
        System.out.print("underscore = " + myThirdNumber + "\n");

        byte myFirstByte = Byte.MIN_VALUE;
        byte mySecondByte = Byte.MAX_VALUE;
        System.out.print(myFirstByte + "\n");
        System.out.print(mySecondByte + "\n");

        short myFirstShort = Short.MIN_VALUE;
        short mySecondShort = Short.MAX_VALUE;
        System.out.print(myFirstShort + "\n");
        System.out.print(mySecondShort + "\n");

        long myFirstLong = Long.MIN_VALUE;
        long mySecondLong = Long.MAX_VALUE;
        long longSize = Long.SIZE;
        System.out.print(myFirstLong + "\n");
        System.out.print(mySecondLong + "\n");
        System.out.print(longSize + "\n");
    }
}
