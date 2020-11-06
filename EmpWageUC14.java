
/*
 * developed by :@ChetnaBisen
 *
 * */

import java.util.LinkedList;
import java.util.HashMap;

public class EmpWageUC14 implements IEvaluateEmpWage {

   public static final int FOR_PART_TIME = 1;
   public static final int FOR_FULL_TIME = 2;



   private int countCompany = 0;
   private LinkedList<CompanyEmpWage> companyEmpWageList;
   private HashMap<String,CompanyEmpWage> companyEmpWageMap;



   public EmpWageUC14() {

      companyEmpWageList = new LinkedList<>();
      companyEmpWageMap = new HashMap<>();

   }

   public void addCompanyEmpWage(String company, int ratePerHr, 
           int numOfWorkingDays, int totalWorkingHours){

      CompanyEmpWage companyEmpWage  = new CompanyEmpWage(company, ratePerHr,numOfWorkingDays,totalWorkingHours);

      companyEmpWageList.add(companyEmpWage);

      companyEmpWageMap.put(company,companyEmpWage);

   }

   public void evaluateEmpWage(){

     for (int i = 0; i < companyEmpWageList.size(); i++) {

          CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);

         companyEmpWage.setTotalEmpWage(this.evaluateEmpWage(companyEmpWage));

          System.out.println(companyEmpWage);

      }

   }

public int getTotalWage(String company){

      return companyEmpWageMap.get(company).totalEmpWage;

   }

 

   private int evaluateEmpWage(CompanyEmpWage companyEmpWage) {

      int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

      while (totalEmpHrs <= companyEmpWage.totalWorkingHours && 
                 totalWorkingDays <=companyEmpWage.numOfWorkingDays) {
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

         return totalEmpHrs * companyEmpWage.ratePerHr;

   }

public static void main(String[] args) {

      IEvaluateEmpWage companies = new  EmpWageUC14();
      companies.addCompanyEmpWage("HDHC",25,5,18);
      companies.addCompanyEmpWage("VMART",28,6,20);
      companies.evaluateEmpWage();
      System.out.println("Total Employee Wage for HDFC company: "+ companies.getTotalWage("HDFC"));
      System.out.println("Total Employee Wage for VMART company: "+ companies.getTotalWage("VMART"));

   }

}
