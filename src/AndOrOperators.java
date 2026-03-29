public class AndOrOperators {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("I'm not an alien");

        }

        int topScore = 81;
        if (topScore >= 100) {
            System.out.println("You got the top score");
        }

        int secondTopScore = 76;
        if (topScore > secondTopScore && topScore < 100) { // AND operator
            System.out.println("Greater than second top score AND less than 100");

        }

        if ((topScore > secondTopScore) || (topScore < 100)) { // OR operator
            System.out.println("Greater than second top score OR less than 100");

        }
// ! and true statement in conditionals
        boolean isCar =  false;
        if (isCar) {
            System.out.println("I'm a Car");
        }
        else if (!isCar) {
            System.out.println("I'm not a Car");
        }

    }
}
