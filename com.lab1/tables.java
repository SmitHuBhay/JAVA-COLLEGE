package com.lab1;
public class tables{
    public static void main(String[] args) {
        System.out.println("Sr\t|Square|Cube");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t|%d\t|%d\n",i,Math.powExact(i,2),Math.powExact(i,3));
        }
    }
}