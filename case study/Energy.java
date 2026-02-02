import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water mass in kg: ");
        double m = sc.nextDouble();

        System.out.print("Enter initial temperature: ");
        double t1 = sc.nextDouble();

        System.out.print("Enter final temperature: ");
        double t2 = sc.nextDouble();

        double energy = m * (t2 - t1) * 4184;

        System.out.println("Energy needed = " + energy + " joules");
        sc.close();
    }
}
