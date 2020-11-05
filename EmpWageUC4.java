
public class EmpWageUC4{
    public static final int FOR_PART_TIME= 1;
    public static final int FOR_FULL_TIME = 2;
    public static final int Emp_Rate_Per_Hr= 20;

    public static void main(String args[]){
    int empHrs = 0;
    int empWage = 0;
    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    System.out.println(empCheck);
    switch (empCheck){
       case FOR_PART_TIME:
           empHrs = 4;
           empWage= empHrs * Emp_Rate_Per_Hr;
           System.out.println("Employee Wage for Part Time is "+ empWage);
           break;
       case FOR_FULL_TIME:
           empHrs = 8;
           empWage= empHrs * Emp_Rate_Per_Hr;
           System.out.println("Employee Wage for Full Time is "+ empWage);
           break;
       default:
           empHrs = 0;
           empWage= empHrs * Emp_Rate_Per_Hr;
           System.out.println("Employee Wage is "+ empWage);

    }
   }
}




