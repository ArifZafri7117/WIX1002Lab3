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

public class L3Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n = (int) (Math.random() * 6);
       String word;

       word = switch (n) {
            case (0) -> "zero";
            case (1) -> "one";
            case (2) -> "two";
            case (3) -> "three";
            case (4) -> "four";
            default -> "five";
        };
      System.out.println(n + " " + "is" + " " + word);
    }
}