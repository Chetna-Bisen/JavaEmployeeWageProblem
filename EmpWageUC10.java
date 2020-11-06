/*
 * developed by :@ChetnaBisen
 *
 * */


class CompanyEmpWage {

public final String company;
public final int ratePerHour;
public final int numOfWorkingDays;
public final int totalWorkingHours;
public int totalWage;

public CompanyEmpWage(String company, int ratePerHour, int numOfWorkingDays, int totalWorkingHours) {
this.company = company;
this.ratePerHour = ratePerHour;
this.numOfWorkingDays = numOfWorkingDays;
this.totalWorkingHours = totalWorkingHours;
}

public void setTotalEmpWage(int totalWage){
this.totalWage = totalWage;
}

public String toString() {
return "Total Employee Wage for "+company+" is "+totalWage;
}

}



public class EmpWageUC10{
public static final int FOR_PART_TIME=1;
public static final int FOR_FULL_TIME=2;
private int countCompany;
private CompanyEmpWage empWageArray[];

public EmpWageUC10() {
empWageArray=new CompanyEmpWage[4];
}

private void addCompanyEmpWage(String company,int ratePerHour,int numOfWorkingDays,int totalWorkingHours) {
empWageArray[countCompany]=new CompanyEmpWage(company,ratePerHour,numOfWorkingDays,totalWorkingHours);
countCompany++;
}

private void evaluateEmpWage() {
for(int i=0;i<countCompany;i++) {
empWageArray[i].setTotalEmpWage(this.evaluateEmpWage(empWageArray[i]));
System.out.println(empWageArray[i]);

}
}

private int evaluateEmpWage(CompanyEmpWage companyEmpWage) {
int empHours=0, totalEmpHours=0, totalWorkingDays=0;
while(totalEmpHours<=companyEmpWage.totalWorkingHours && totalWorkingDays<companyEmpWage.numOfWorkingDays){
             int select=(int)(Math.floor(Math.random()*10)%3);
               switch(select){
               case FOR_PART_TIME:
                       empHours = 4;
                       break;
               case FOR_FULL_TIME:
                       empHours = 8;
                       break;
               default :
                       empHours = 0;
               }
               totalEmpHours += empHours;
               totalWorkingDays += 1;
 }
return totalEmpHours * companyEmpWage.ratePerHour;

}

public static void main(String args[]) {
EmpWageUC10 companies=new EmpWageUC10();
companies.addCompanyEmpWage("Fintech", 18, 18, 90);
companies.addCompanyEmpWage("Tesla", 25, 24, 100);
companies.evaluateEmpWage();

}
}
