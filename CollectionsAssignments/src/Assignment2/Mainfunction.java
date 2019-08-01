package Assignment2;
import  Assignment2.Employee;
import Assignment2.EmployeeDB;
public class Mainfunction {
   public static void main(String []args) {
	  EmployeeDB empdb=new EmployeeDB();
	  Employee emp1=new Employee(101,"srinu","srinivasreddychalla133@gmail.com",'M',52000);
	  Employee emp2=new Employee(102,"prudvi","prpr@gmail.com",'M',55000);
	  Employee emp3=new Employee(103,"srinivas","srinivas.srinivas.challa@gmail.com",'M',95000);
	  empdb.addEmployee(emp1);empdb.addEmployee(emp2);empdb.addEmployee(emp3);
	  for(Employee emp:empdb.listAll()) {
		  System.out.println(emp.GetEmployeeDetails());}
	  System.out.println();
	  empdb.deleteEmployee(102);
	  for(Employee emp:empdb.listAll()) {
		  System.out.println(emp.GetEmployeeDetails()); }
	  System.out.println();
	  System.out.println(empdb.showPaySlip(103));
	  
   }
}
