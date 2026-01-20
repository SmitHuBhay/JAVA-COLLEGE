// package lab2;
import java.util.Scanner;
class Amount{
    double hours;
    int TotalCar;
    double Calculate(){
        if(hours<4){
            return 2;
        }
        else if( hours >3 && hours <20){
            return (2 + (hours-3)*0.5) ;
        }
        else{
            return 10;
        }
    }
}
public class charge {
    public static void main(String[] args){
        Amount A = new Amount();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hours parked: ");
        A.hours = input.nextDouble();
        System.out.print("Enter Total car parked Yesterday: ");
        A.TotalCar = input.nextInt();
        System.out.println("Parking Charges: "+A.Calculate());
        System.out.println("Yesterday custumber: "+A.TotalCar);
    }
}
