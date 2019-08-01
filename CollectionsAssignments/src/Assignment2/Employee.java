package Assignment2;
public class Employee {
public int EmpId;public String EmpName;public String Empemail;public char EmpGender;public float EmpSalary;
public Employee(int empId,String empName,String email,char gender,float salary) {
	//super();
	EmpId=empId;
    EmpName=empName;
	Empemail=email;
	EmpGender=gender;
	EmpSalary=salary;}
public String GetEmployeeDetails() {
	return("Employee (empId=" + EmpId + ", empName=" + EmpName + ",Empemail=" + Empemail + ", EmpGender=" + EmpGender + ", Empsalary=" +EmpSalary + ")");}
public void setEmpId(int empId) {
	EmpId = empId;}
public int getEmpId() {
	return(EmpId);}
public void SetempName(String empName) {
	EmpName=empName;}
public String getempName() {
	return(EmpName);}
public void  Setemail(String email) {
	Empemail=email;}
public String getemail() {
	return(Empemail);}
public void  SetGender(char empGender) {
	EmpGender=empGender;}
public char GetGender() {
	return(EmpGender);}
public void SetSalary(float empsalary) {
	EmpSalary=empsalary;}
public float GetSalary() {
	return(EmpSalary);}}