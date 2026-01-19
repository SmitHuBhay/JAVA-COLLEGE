package com.lab2;
import java.util.Scanner;
//  Create a class called date that include three instance variable a) month(type int) b)day (type int) and c) year
// (type int) . provide a constructer that initialize a three instance variable and assume the value provided are
// correct. Provide a set and a get method for each instance variable.Provide a method DisplayDate that display the
// month year and day separated by forward slashand write a test application named DateTest that demonstrate
// date capabilities.
public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month(number) : ");
        int m = sc.nextInt();
        System.out.println("Enter date(number) : ");
        int d = sc.nextInt();
        System.out.println("Enter Year : ");
        int y = sc.nextInt();
        date day = new date(m, d, y);
        System.out.println("The date is : " + day.getD() + "/" + day.getM() + "/" + y);
        sc.close();
    }
}
final class date{
    int m,d,y;
    public date(int m,int d,int y) {
        setD(d);
        setM(m);
        this.y=y;
    }
    public void setYear(int y){
        this.y = y;
    }
    public void setM(int m) {
        if(m>0 && m<=12){
            this.m=m;
        }
    }
    public void setD(int d) {
        // if(m==1 || m==3 || m==5 || m==7 || m == 8 || m==10 || m==12){
        //     if(this.d<=31 && this.d >0){
        //         this.d = d;
        //     }
        // }else{
        //     if(this.d<=30 && this.d>0){
        //         this.d = d;
        //     }
        // }
        this.d=d;
    }
    public int getD() {
        return d;
    }
    public int getM() {
        return m;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    
}
