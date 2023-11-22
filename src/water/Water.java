/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water;

/**
 *
 * @author Maria
 */
import java.util.Scanner;
public class Water {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("WATER MEASURING APPLICATION");
        System.out.println("*******************************");
        System.out.println("Enter the Customer ID >> ");
        int id = scan.nextInt();
        System.out.println("Enter the water measure for Month 1 of Customer " + id);
        int month1 = scan.nextInt();
        System.out.println("Enter the water measure for Month 2 of Customer " + id);
        int month2 = scan.nextInt();
        System.out.println("Enter the water measure for Month 3 of Customer " + id);
        int month3 = scan.nextInt();
        
        Print(month1, month2, month3);
    }
    public static int Total(int month1, int month2, int month3)
    {
      int x = month1 + month2 + month3; 
      return(x);
    }
    
     public static int Average(int month1, int month2, int month3)
    {
      int y = (month1 + month2 + month3)/3; 
     return(y);
    }
     public static void Print(int month1, int month2, int month3)
    {
        System.out.println("Total :" + Total(month1, month2, month3));
        System.out.println("Average :" + Average(month1, month2, month3));
     
    }
}
