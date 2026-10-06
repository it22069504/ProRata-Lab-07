
import java.util.Scanner;

public class IT22069504Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char payment = input.next().charAt(0);

            if (payment == 'C' || payment == 'c') {
                double discount = bill * 0.05;
                double amount = bill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amount);
            } else if (payment == 'O' || payment == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            if (i < 5) {
                System.out.println();
            }
        }

        input.close();
    }
}
