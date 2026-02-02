import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting velocity (v0): ");
        double v0 = sc.nextDouble();

        System.out.print("Enter ending velocity (v1): ");
        double v1 = sc.nextDouble();

        System.out.print("Enter time : ");
        double t = sc.nextDouble();

        double acceleration = (v1 - v0) / t;

        System.out.println("Average acceleration = " + acceleration);
        sc.close();
    }
}
