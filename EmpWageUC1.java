
public class EmpWageUC1{
  public static void main(String args[]){
    int FOR_FULL_TIME=1;
    double empCheck = Math.floor(Math.random()*10)%2;
    System.out.println(empCheck);
    if (empCheck == FOR_FULL_TIME)
       System.out.println("Employee is Present");
    else
       System.out.println("Employee is Absent");
}
}
