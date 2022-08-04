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
 class student {
     int roll_no;
     String name;
  
   
}
 public class ObjectClassAssighnment{
public static void main(String[] args) {
    student s1=new student();
    s1.roll_no=2;
    s1.name = "jhon";
     System.out.println(+s1.roll_no+" is the rollnumber of student");
  System.out.println(" the name of the student is "+s1.name );
}
}

