
public class CompanyEmpWage {
    public final String company;
    public final int ratePerHr;
    public final int numOfWorkingDays;
    public final int totalWorkingHours;
    public int totalEmpWage;


  public CompanyEmpWage(String company, int ratePerHr, 
       int numOfWorkingDays, int totalWorkingHours) {

      this.company = company;
      this.ratePerHr = ratePerHr;
      this.numOfWorkingDays = numOfWorkingDays;
      this.totalWorkingHours = totalWorkingHours;
      totalEmpWage = 0;

   }

 

   public void setTotalEmpWage(int totalEmpWage) {

      this.totalEmpWage = totalEmpWage;

   }

   public String toString(){

      return "Total Emp Wage for company: " +company+ " is " +totalEmpWage;

   }

}
