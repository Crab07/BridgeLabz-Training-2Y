import java.util.Scanner;

public class Q10CmFeetInch {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter your height : ");
        double Cm = input.nextDouble();

        double Inches = Cm / 2.54;

        int feet = (int) (Inches / 12);
        double inches = Inches % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n",
                          Cm, feet, inches);
        }

    }
}