/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_task;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Company_Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your data to know your salary: \n" +"If you work android developer please press (1) ,\n"+"if you work flutter developer press (2)");
        int job=sc.nextInt();
        if (job !=1&&job!=2){ System.out.println("not found , please press (1) or (2)");}
        else{
        System.out.println("Enter your name:");
       String name = sc.next();
       System.out.println("Please Enter num of hours worked:");
       double numWorked=sc.nextDouble();
                 System.out.println("Please Enter your num of hours absence :");
                 double numAbscence=sc.nextDouble();
                 if(job==1){
      AndroidDeveloper a=new AndroidDeveloper(name,Employee.jobAnd, numWorked, numAbscence,Employee.hourPriceAnd,Employee.hourabsencePriceAnd,Employee.numofHourAbsenceAllowAnd);
 }
                 else if (job==2){
                     FlutterDeveloper b =new FlutterDeveloper(name, Employee.jobFlu, numWorked, numAbscence,Employee.hourPriceFlu,Employee.hourabsencePriceFlu,Employee.numofHourAbsenceAllowFlu);
                 }
                 
    }
    
}}
