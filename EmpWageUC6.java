
public class EmpWageUC6{
    public static final int FOR_PART_TIME = 1;
    public static final int FOR_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int TOTAL_WORKING_HOURS = 100;

    public static void main(String args[]){
    int totalEmpHrs = 0 , totalEmpWage = 0 , totalWorkingDays = 0;
    while (totalEmpHrs <= TOTAL_WORKING_HOURS &&
           totalWorkingDays < NUM_OF_WORKING_DAYS){
        int empHrs = 0;
        totalWorkingDays++;
        int select = (int) Math.floor(Math.random() * 10) % 3;
        switch (select){
           case FOR_PART_TIME:
               empHrs = 4;
               break;
           case FOR_FULL_TIME:
               empHrs = 8;
               break;
           default:
               empHrs = 0;
    }
       totalEmpHrs+= empHrs;
       int empWage = empHrs * EMP_RATE_PER_HR;
       totalEmpWage += empWage;
       System.out.println("Day: "+ totalWorkingDays +"  "+ "Employee working hours:" + empHrs );
   }
   System.out.println("Total Earning of Employee "+ totalEmpWage);
}
}



