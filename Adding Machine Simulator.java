import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Please enter the numbers.");

        int Subtotal = 0;
        int Total = 0;
        boolean previousWasZero = false;

        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                if (previousWasZero) {
                    System.out.println("total: " + Total);
                    
                } else {
                    System.out.println("subtotal: " + Subtotal);
                    Subtotal = 0;
                    previousWasZero = true;
                }
            } else {
                Subtotal += number;
                Total += number;
                previousWasZero = false;
            }
        }
    }
}
