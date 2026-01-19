package com.lab2;
import java.util.Scanner;
//  a)total miles driven per day
//  b)cost per gallon of gasoline
//  c)average fees per day
//  d)tolls per day
public class gasolinee {
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter total miles driven per day");
        int miles = sc.nextInt();
        System.out.println("Enter cost per gallon of gasoline");
        int cost = sc.nextInt();
        System.out.println("Enter average fees per day");
        int fees = sc.nextInt();
        System.out.println("Enter tolls per day");
        int toll = sc.nextInt();
        t_cost s = new t_cost(miles, cost, fees, toll);
        System.out.println("Total daily driving cost is: " + s.fullcost());
    }
}
class t_cost{
    int miles,cost,fees,toll;

    t_cost(int miles,int cost,int fees,int toll){
        this.miles = miles;
        this.cost = cost;
        this.fees = fees;
        this.toll = toll;
    }
    int fullcost(){
        return miles*cost+fees*toll;
    }
}
