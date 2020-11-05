
public class EmpWageUC2{
  public static void main(String[] args){
    int FOR_FULL_TIME = 1;
    int Emp_Rate_Per_Hr=20;
    int empHrs = 0;
    int empWage = 0;
    double empCheck = Math.floor(Math.random() * 10) % 2;
    System.out.println(empCheck);
    if (empCheck == FOR_FULL_TIME)
       empHrs = 8;
       empWage= empHrs * Emp_Rate_Per_Hr;
       System.out.println("Employee Wage is "+ empWage);
   }
}




