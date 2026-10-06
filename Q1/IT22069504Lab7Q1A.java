
import java.util.Scanner;

public class IT22069504Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;
        String grade;

        System.out.println("Enter marks for four subjects:");

        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextInt();

        average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is: " + grade);

        input.close();
    }
}
