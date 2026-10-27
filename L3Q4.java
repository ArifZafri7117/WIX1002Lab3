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

public class L3Q4{
    public static void main(String[] args) {
  
      int p1a = (int) (Math.random() * 6) + 1;
        int p1b = (int) (Math.random() * 6) + 1;
        int p2a = (int) (Math.random() * 6) + 1;
        int p2b = (int) (Math.random() * 6) + 1;

      int score1 = p1a + p1b;
      int score2 = p2a + p2b;

      System.out.print("Player 1 rolled" + " " + p1a + " " + "and" + " " + p1b + " " + "=" + " " + score1 + "\n");
       System.out.print("Player 2 rolled" + " " + p2a + " " + "and" + " " + p2b + " " + "=" + " " + score2 + "\n");

      if(score1 > score2)
        System.out.println("Player 1 win !");
      else if(score2 > score1)
        System.out.println("Player 2 win !");
      else 
        System.out.println("Draw");
      
    }
}
