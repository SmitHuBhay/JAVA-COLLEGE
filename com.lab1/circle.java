package lab1;

import java.util.Scanner;
public class circle {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int r = s.nextInt();
        int d = r*2;
        float pi = (float)Math.PI;
        float c = d*pi;
        float a = pi*(float)Math.powExact(r, 2);

        System.out.printf("The Diameter , Circumfrence and Area of a circle with Radius %d is %d , %f , %f respectively",r,d,c,a);
    }
}
