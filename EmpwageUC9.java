
public class EmpwageUC9{
      public static final int FOR_PART_TIME = 1;
      public static final int FOR_FULL_TIME = 2;

	private final String company;
	private final int ratePerHr;
	private final int numOfWorkingDays;
	private final int totalWorkingHours;

   public EmpwageUC9(String company, int ratePerHr, int numOfWorkingDays, 
                int totalWorkingHours) {
        this.company = company;
        this.ratePerHr = ratePerHr;
	this.numOfWorkingDays = numOfWorkingDays;
	this.totalWorkingHours = totalWorkingHours;
	}

   public int  evaluateEmpWage() {
      int empHrs = 0;
      int totalEmpHrs = 0;
      int totalWorkingDays = 0;
      while (totalEmpHrs <= totalWorkingHours && totalWorkingDays < 
               numOfWorkingDays) {
         totalWorkingDays++;
         int select = (int)Math.floor(Math.random() * 10) % 3;
         switch (select) {
         case FOR_PART_TIME:
              empHrs = 4;
              break;
         case FOR_FULL_TIME:
              empHrs = 8;
              break;
         default:
              empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Day: " +totalWorkingDays + " Emp Hrs: " +empHrs);
      }
         return totalEmpHrs * ratePerHr;
   }


	public static void main(String[] args) {

	   EmpwageUC9 Jio = new EmpwageUC9("Jio", 20, 5, 15);
	   EmpwageUC9 Tesla = new EmpwageUC9("Tesla", 30, 6, 30);
           EmpwageUC9 Fintech = new EmpwageUC9("Fintech", 25, 6, 28);

      System.out.println("Total Employee wage for company: " +Jio.company +
                        " is Rs. " +Jio.evaluateEmpWage());
      System.out.println("Total Employee wage for Company: " +Tesla.company + 
                        " is Rs. "+Tesla.evaluateEmpWage());
      System.out.println("Total Employee wage for Company: " +Fintech.company + 
                        " is Rs. "+Fintech.evaluateEmpWage());

   }
}
