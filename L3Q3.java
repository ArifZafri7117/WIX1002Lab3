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

public class L3Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.print("Enter Sales Volume : ");
       double sales = input.nextDouble();
      double commissions;

      if(sales <= 100)
        commissions = sales * 0.05;
      else if(sales <= 500)
        commissions = sales * 0.075;
      else if(sales <= 1000)
        commissions = sales * 0.10;
      else
        commissions = sales * 0.125;

      System.out.printf("Commissions : %.2f%n", commissions);
   
    }
}
