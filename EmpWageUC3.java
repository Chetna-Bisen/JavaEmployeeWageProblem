
public class EmpWageUC3{
  public static void main(String args[]){
    int FOR_PART_TIME=1;
    int FOR_FULL_TIME = 2;
    int Emp_Rate_Per_Hr=20;
    int empHrs = 0;
    int empWage = 0;
    double empCheck = Math.floor(Math.random() * 10) % 3;
    System.out.println(empCheck);

    if (empCheck == FOR_PART_TIME){
       empHrs = 4;
       empWage= empHrs * Emp_Rate_Per_Hr;
       System.out.println("Employee Wage for Part Time is "+ empWage);
    }
    else if (empCheck == FOR_FULL_TIME){
       empHrs = 8;
       empWage= empHrs * Emp_Rate_Per_Hr;
       System.out.println("Employee Wage for Full Time is "+ empWage);
    }
    else{
       empHrs = 0;
       System.out.println("Employee Wage is Zero");
    }
   }
}




