package jan30task6empclass;
import jan30.Task6;
@SuppressWarnings("unused")
public class Employee {
public static void main(String args[])
{
	Task6 emp=new Task6();
	emp.setEmployeeDetails(101, "ravi", 25000);
	emp.getEmployeeDetails();
	emp.getLoanEligibility(1000000.0, 8);
}
}
