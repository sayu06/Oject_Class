/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Sayali
 */
import java.util.Scanner;
public class AeraRectangleMethod {
    double l , b;

   void setDim(double ll , double bb)

   {
       l = ll;
       b = bb;
   }

   double getArea()
   {
       return l*b;
   }

   public static void main(String args[])

   {
       Scanner Sc = new Scanner(System.in);

       double l , b;

       System.out.print("Enter Length : ");

       l = Sc.nextDouble();

       System.out.print("Enter Breadth : ");

       b = Sc.nextDouble();

       AeraRectangleMethod rect = new AeraRectangleMethod();

       rect.setDim(l , b);

       System.out.print("Area of Rectangle : " + rect.getArea());

   }
}

