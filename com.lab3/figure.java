package com.lab3;
import java.util.Scanner;
// Q1.)Design a class called figure . It must have three attributes r,a and v of the data type douoble.It must have the
// following methods:
// public void dispArea(); public void dispVolume();
// The method dispArea must have a statement to print the volume of a. The method dispVolume();
// must have a statement to print the value of v.Design a class cone . It must extends class figure class .It must also
// have the following attributes h,s of type double.It must have following methods:
// public void calcArea();public void calcVolume();
// The formulae for the area and volume of the cone are as follows:
// Area of a cone(pi*r*r)+(pi*r*s)
// volume of a con=(p*r*s)/3
// Write a main method in a class called inheritance demo to demonstrate inheritance.
public class Figure{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double r = sc.nextDouble();
        System.out.println("Enter the height : ");
        double s = sc.nextDouble();
        InheritanceDemo x = new Volume(r,s);
        System.out.println("Area is : " + x.calcArea());
        System.out.println("Volume is : " + x.calcVolume());
    }
}
abstract class InheritanceDemo{
    abstract public double calcArea();
    abstract public double calcVolume();
}
class Area extends InheritanceDemo{
    double r,a,s;
    public Area(double r, double s) {
        this.r = r;
        this.s = s;
    }
    @Override
    public double calcArea(){
        this.a = Math.PI*Math.pow(r, 2) + Math.PI*r*s;
        return a;
    }
    @Override
    public double calcVolume() {
        return 0;
    }
}
class Volume extends Area{
    double v;
    public Volume(double r,double s){
        super(r,s);
    }
    @Override
    public double calcVolume(){
        this.v = (Math.PI*(double)Math.pow(r, 2)*s)/3;
        return v;
    }

}