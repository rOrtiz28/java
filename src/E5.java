//Exercise 5 — Grade Calculator:
//Create E5.java. Declare an int variable called score with value 87.
//Using if/else if/else statements, print the letter grade: A (90-100), B (80-89), C (70-79), D (60-69), F (below 60).
//Also print whether the student passed or failed using a boolean variable (passing is 60 or above).
//Use && to check if the score is valid (between 0 and 100) before grading — if it's not valid, print an error message.

public class E5 {
    public static void main(String[] args) {
        int score = 90;
        boolean studentGrade = score >= 60;
        if (score <= 100 && score >= 0) {
            if (score >= 90) {
                System.out.println("A");
            }
            else if (score >= 80) {
                System.out.println("B");
            }
            else if (score >= 70) {
                System.out.println("C");
            }
            else if (score >= 60) {
                System.out.println("D");
            }
            else if (score >= 0) {
                System.out.println("F");
            }
            System.out.println("Passed: " + studentGrade);
        }
        else {
            System.out.println("Invalid score");
        }


    }
}
