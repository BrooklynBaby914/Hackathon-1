import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner nope = new Scanner(System.in);

        System.out.print("Please enter waste collected at point 1: ");
        double one = nope.nextDouble();

        System.out.print("Please enter waste collected at point 2: ");
        double two = nope.nextDouble();

        System.out.println("The total waste collected is: " + calculateTotalWaste(one, two));
    }
    
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
    return (point1Waste + point2Waste);
    }
}



