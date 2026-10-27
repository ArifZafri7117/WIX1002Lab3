/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer number: ");
        int a = input.nextInt();
        System.out.println("Enter second integer number: ");
        int b = input.nextInt();
      System.out.print("Enter operand : ");
      char op = input.next().charAt(0);

      switch (op){
        case '+':
          System.out.println(a + "+" + b + "=" + (a + b));
          break;
        case '-':
          System.out.println(a + "-" + b + "=" + (a - b));
          break;
        case '*':
          System.out.println(a + "*" + b + "=" + (a * b));
          break;
        case'/':
          if(b==0)
            System.out.println("Error! Cant divide by 0");
          else
             System.out.println(a + "/" + b + "=" + (a / b));
          break;
        case'%':
          if(b==0)
            System.out.println("Error! Cant divide by 0");
          else
             System.out.println(a + "%" + b + "=" + (a % b));
          break;
        default:
          System.out.println("Invalid Input!");
      }
    }
}

    