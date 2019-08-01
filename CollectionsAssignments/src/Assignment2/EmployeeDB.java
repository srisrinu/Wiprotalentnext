package Assignment2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class EmployeeDB {
List<Employee> empDb=new ArrayList<Employee>();
public boolean addEmployee(Employee e) {
	return(empDb.add(e));}
public boolean deleteEmployee(int empId) {
	boolean isRemoved=false;
	Iterator<Employee> it=empDb.iterator();
	while(it.hasNext()) {
		Employee emp=it.next();
		if(emp.getEmpId()==empId) {
			isRemoved=true;
			it.remove();}}
	return(isRemoved);}
public String showPaySlip(int empId) {
	String paySlip="Invalid employee id";
	for(Employee e:empDb) {
		if(e.getEmpId()==empId) {
			paySlip="pay slip for employee id "+empId+" is "+e.GetSalary();}}
	return(paySlip);}
public Employee[] listAll(){
	Employee [] empArray=new Employee[empDb.size()];
	for(int i=0;i<empDb.size();i++) {
		empArray[i]=empDb.get(i);}
	return(empArray);}}
