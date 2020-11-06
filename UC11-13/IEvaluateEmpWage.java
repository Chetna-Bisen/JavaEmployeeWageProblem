public interface IEvaluateEmpWage {

   public void addCompanyEmpWage(String company,int ratePerHr,
           int numOfWorkingDays,int totalWorkingHours);

   public void evaluateEmpWage();

   public int getTotalWage(String company);

}


