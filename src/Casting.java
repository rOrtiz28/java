public class Casting {
    public static void main(String[] args){
        int myFirstNumber = 5, mySecondNumber = 5;
        System.out.print(myFirstNumber + "\n");
        System.out.print(mySecondNumber + "\n");

        short myFirstShort = 5, mySecondShort = 5;
        short myShort = (short) (myFirstShort + mySecondShort);
        System.out.print(myShort + "\n");
    }
}
