import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r1's centre");
        System.out.println("x : ");
        int x1 = sc.nextInt();
        System.out.println("y : ");
        int y1 = sc.nextInt();
        System.out.println("Width : ");
        int w1 = sc.nextInt();
        System.out.println("height : ");
        int h1 = sc.nextInt();
        System.out.println("Enter r2's centre");
        System.out.println("x : ");
        int x2 = sc.nextInt();
        System.out.println("y : ");
        int y2 = sc.nextInt();
        System.out.println("Width : ");
        int w2 = sc.nextInt();
        System.out.println("height : ");
        int h2 = sc.nextInt();
        boolean oX = Math.abs(x1 - x2) <= (w1 + w2) / 2.0;
        boolean oY = Math.abs(y1 - y2) <= (h1 + h2) / 2.0;

        if (oX && oY) {
            System.out.println("Overlaps");
        } else {
            System.out.println("Doesn't overlap");
        }
        sc.close();
    }
}

