
public class EmpWageMultiUC8{
    public static final int FOR_PART_TIME = 1;
    public static final int FOR_FULL_TIME = 2;

    public static int calculateEmpWage(String Company , int EMP_RATE_PER_HR,
                            int NUM_OF_WORKING_DAYS, int TOTAL_WORKING_HOURS ){

         int empHrs = 0;
         int totalEmpHrs = 0;
         int totalWorkingDays = 0;
         while (totalEmpHrs <= TOTAL_WORKING_HOURS &&
              totalWorkingDays < NUM_OF_WORKING_DAYS){
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
     }
     int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
     System.out.println("Total Employee Wage for Company" +
                          "  " +Company + " is " + " " + totalEmpWage);
     return totalEmpWage;
   }
   public static void main(String args[]){
       calculateEmpWage("Britania", 30 , 6 , 15);
       calculateEmpWage("Dabur", 35 , 6 , 25);
       calculateEmpWage("Parle", 25 , 5 , 28);


   }
}
