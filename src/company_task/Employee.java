/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_task;


public interface Employee {
    
   
    
    void getSalary(double numOfHoursWorked ,double numOfHourAbsence);
    void getTotalMoneyDeductedFromSalary(double numOfHourAbsence,String job);
}
