import java.util.Scanner;

public class Runway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed (v): ");
        double v = sc.nextDouble();

        System.out.print("Enter acceleration (a): ");
        double a = sc.nextDouble();

        double length = (v * v) / (2 * a);

        System.out.println("Minimum runway length = " + length);
        sc.close();
    }
}
