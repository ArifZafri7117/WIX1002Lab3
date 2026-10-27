/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a = ");
        double a = input.nextDouble();
        System.out.print("Enter b = ");
        double b = input.nextDouble();
        System.out.print("Enter c = ");
        double c = input.nextDouble();
        System.out.print("Enter d = ");
        double d = input.nextDouble();
        System.out.print("Enter e = ");
        double e = input.nextDouble();
        System.out.print("Enter f = ");
        double f = input.nextDouble();
       
        double det = a * d - b * c;

        if (det == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / det;
            double y = (a * f - e * c) / det;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}