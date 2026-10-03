import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner nope = new Scanner(System.in);
        
        System.out.print("Please enter Vehicle Number: ");
        int veh = nope.nextInt();

        System.out.print("Please enter weight of waste collected: ");
        double wei = nope.nextDouble();

        System.out.print("Please enter no. of collection points: ");
        int col = nope.nextInt();

        System.out.print("Please enter vehicle status: ");
        char sta = nope.next().charAt(0);

        System.out.printf("Vehicle number is: %s", veh);
        System.out.println("    ");
        System.out.printf("Weight of waste collected is: %s", wei);
        System.out.println("     ");
        System.out.printf("No. of collection points is: %s", col);
        System.out.println("     ");
        System.out.printf("Vehicle status is: %s", sta);
        System.out.println("     ");

    }
}