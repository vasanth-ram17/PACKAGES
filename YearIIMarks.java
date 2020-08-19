/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YEAR_2;
import java.util.Scanner;
/**
 *
 * @author Vasanth
 */
public class YearIIMarks {
   Scanner input = new Scanner(System.in);
       public void sub3marks(){
       System.out.print("Enter the marks of subject 3 : ");
       int m1 = input.nextInt();
      
       if(m1>50 && m1<100){
             System.out.println("Subject 3 result:");
             System.out.println("well done..PASS!!");
       }
        else if(m1>100){
            System.out.println("invalid mark"); 
       }
       else{
         System.out.println("Subject 3 result:");
         System.out.println("Better luck next time..FAIL");   
       }
       
      }
       public void sub4marks(){
        System.out.print("Enter the marks of subject 4 : ");
       int m2 = input.nextInt();
       if(m2>50 && m2<100){
            System.out.println("Subject 4 result:");
             System.out.println("well done..PASS!!");
       }
       else if(m2>100){
            System.out.println("invalid mark"); 
       }
       else{
         System.out.println("Subject 4 result:");
         System.out.println("Better luck next time..FAIL");
       }
       }
    
}
