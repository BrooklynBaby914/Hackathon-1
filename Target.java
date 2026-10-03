import java.util.Scanner;

public class Target {
    public static void main(String[] args) {
        Scanner nope = new Scanner(System.in);

        System.out.print("Please enter the waste collected in kilograms: ");
        double waste = nope.nextDouble();

        if (waste >= 100) {
            System.out.println("Collection Target Acheived.");
        } else {
            System.out.println("More Waste Collection Required.");
        }
    }
}