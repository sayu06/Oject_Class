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
class student1 {
     int roll_no;
     int phone;
     String address;



}
 public class TwoObjectCreate{
public static void main(String[] args) {
    student1 s1=new student1();
        student1 s2=new student1();
    s1.roll_no=2;
    s1.address="Nagar";
    s1.phone=43212;
    s2.roll_no=3;
    s2.address="pune";
    s2.phone=1234;
    System.out.println("roll number is" +s1.roll_no+" whose phone number is "+s1.phone+" and address is "+s1.address+" ..!");    
    System.out.println(" roll number is "+s2.roll_no+" whose phone number is "+s2.phone+" and address is "+s2.address+" ..!");
  }
} 

