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

public class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of the circle = ");
        double radius = input.nextDouble();
        System.out.print("Enter the coordinate (x/y) = ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        double distance = Math.sqrt(x * x + y * y);
        
    if(distance <= radius)
        System.out.println("The point is inside the circle");
    else
        System.out.print("The point is outside the circle");
    }
}
