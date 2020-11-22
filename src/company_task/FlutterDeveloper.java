/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_task;

/**
 *
 * @author hp
 */
public class FlutterDeveloper extends  AndroidDeveloper implements Employee{
  private String name;
  private String job;
  private double numOfHoursWorked;
  private double numhOfHourAbsence;
    double hourPrice;
    double  hourabsencePrice;
  double numofHourAbsenceAllow;

    public FlutterDeveloper(String name, String job, double numOfHoursWorked, double numhOfHourAbsence, double hourPrice, double hourabsencePrice, double numofHourAbsenceAllow) {
        super(name, job, numOfHoursWorked, numhOfHourAbsence, hourPrice, hourabsencePrice, numofHourAbsenceAllow);
        this.name = name;
        this.job = job;
        this.numOfHoursWorked = numOfHoursWorked;
        this.numhOfHourAbsence = numhOfHourAbsence;
        this.hourPrice = hourPrice;
        this.hourabsencePrice = hourabsencePrice;
        this.numofHourAbsenceAllow = numofHourAbsenceAllow;
    }
    
   
    }

   
    

    
   

