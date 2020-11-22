/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_task;


public interface Employee {
      double  hourPriceFlu=100;
      double hourabsencePriceFlu=120;
      double numofHourAbsenceAllowFlu=5; 
      String jobFlu= "FlutterDeveloper";
    
    double hourPriceAnd=50;
    double  hourabsencePriceAnd=60;
    double numofHourAbsenceAllowAnd=10;
    String jobAnd= "AndroidDeveloper";
   
         void getSalary(double numOfHoursWorked ,double numOfHourAbsence);
         void getTotalMoneyDeductedFromSalary(double numOfHourAbsence,String job);
}
