/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YEAR_1;
import java.util.Scanner;
import YEAR_2.YearIIMarks;
/**
 *
 * @author Vasanth
 */
public class Student {
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the Roll No of the student : ");
       String RollNo = input.next();
       System.out.print("Enter the name of the student : ");
       String name = input.next();
       
      
       YearIMarks A = new YearIMarks();
       A.sub1marks();
       A.sub2marks();
       YEAR_2.YearIIMarks B = new  YEAR_2.YearIIMarks();
       B.sub3marks();
       B.sub4marks();
   }
}

class YearIMarks{
    Scanner input = new Scanner(System.in);
       void sub1marks(){
       System.out.print("Enter the marks of subject 1 : ");
       int m1 = input.nextInt();
      
       if(m1>50 && m1<100){
             System.out.println("Subject 1 result:");
             System.out.println("well done..PASS!!");
       }
      
       else{
         System.out.println("Subject 1 result:");
         System.out.println("Better luck next time..FAIL"); 
        
       }
      
       
      }
       void sub2marks(){
        System.out.print("Enter the marks of subject 2 : ");
       int m2 = input.nextInt();
        if(m2>50 && m2<100){
            System.out.println("Subject 2 result:");
             System.out.println("well done..PASS!!");
       }
         else if(m2>100){
            System.out.println("invalid mark"); 
       }
       else{
         System.out.println("Subject 2 result:");
         System.out.println("Better luck next time..FAIL");
       }
       }
}



