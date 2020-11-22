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
public class FlutterDeveloper implements Employee{
      private String name;
  private String job= "Flutter Developer";
   double numOfHoursWorked;
 private  int hourPrice=100;
   private   int hourabsencePrice=120;
  private double numofHourAbsenceAllow=5;
  private double numhOfHourAbsence;
   
    
    
     public FlutterDeveloper(String name, String job, double numOfHoursWorked, double numhOfHourAbsence) {
        this.name = name;
        this.job = job;
        this.numOfHoursWorked = numOfHoursWorked;
        this.numhOfHourAbsence = numhOfHourAbsence;
         if(numhOfHourAbsence<0){System.out.println("Please check num of hours which you entered (it must be positive num)");
 }
        else {getSalary(numOfHoursWorked, numhOfHourAbsence);
             getTotalMoneyDeductedFromSalary(numhOfHourAbsence, job);
         }
    }

    public double getNumOfHoursWorked() {
        return numOfHoursWorked;
    }

    public void setNumOfHoursWorked(double numOfHoursWorked) {
        this.numOfHoursWorked = numOfHoursWorked;
    }

    public double getNumhOfHourAbsence() {
        return numhOfHourAbsence;
    }

    public void setNumhOfHourAbsence(double numhOfHourAbsence) {
        this.numhOfHourAbsence = numhOfHourAbsence;
    }
      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    
    @Override
    public void getSalary(double numOfHoursWorked ,double numOfHourAbsence){
       //صافي المرتب
       double salary;
       if(numOfHourAbsence<=numofHourAbsenceAllow){
             salary= hourPrice*numOfHoursWorked;}
       else{
           double salaryBeforeDeduction=hourPrice*numOfHoursWorked;
              salary=( hourPrice*numOfHoursWorked)-(numOfHourAbsence*hourabsencePrice);
           System.out.println("your Salary before deduction:"+ salaryBeforeDeduction);}
    System.out.println("your name :"+name+" & your Salary :"+salary);}
    

    
    @Override
    public void getTotalMoneyDeductedFromSalary(double numOfHourAbsence,String job){
        //قيمة الخصم
        double salaryDeduction;
        if (numOfHourAbsence<=numofHourAbsenceAllow){salaryDeduction=0;   }
        else{salaryDeduction=numOfHourAbsence*hourabsencePrice;}
        System.out.println("You work as :"+job+" & The amount has been deducted from salary :"+ salaryDeduction);
    }
}
