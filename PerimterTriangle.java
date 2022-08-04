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
 class Triangle{
  int a,b,c;
  public double getArea(){
    double s = (a+b+c)/2.0;
    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
  }
  public double getPerimeter(){
    return (a+b+c)/2.0;
  }
}
public class PerimterTriangle {
  public static void main(String[] args){
    Triangle t1 = new Triangle();
    t1.a = 2;
    t1.b = 5;
    t1.c = 6;
    System.out.println(t1.getArea());
    System.out.println(t1.getPerimeter());
  }
} 

