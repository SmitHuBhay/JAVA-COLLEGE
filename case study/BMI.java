import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double weight = pounds * 0.45359237;
        double height = inches * 0.0254;

        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);
        sc.close();
    }
}
