public class Employee{
	public static void main(String []args) {
		int EmpNo[]= {1001,1002,1003,10004,1005,1006,1007};
		String EmpName[]= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	String[] Join_Date={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
	char DesignationCode[]= {'e','c','k','r','m','e','c'};
	String Department[]= {"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
	int Basic[]= {20000,30000,10000,12000,50000,23000,29000};
	int HRA[]= {8000,12000,8000,6000,20000,9000,12000};
	int IT[]= {3000,9000,1000,2000,20000,4400,10000};
	int sal=0,flag=0;
	String des="";
	for(int i=0;i<EmpNo.length;i++) {
		if(Integer.parseInt(args[0])==EmpNo[i]) {
			switch(DesignationCode[i]) {
			case 'e':des="Engineer";sal=Basic[i]+HRA[i]+20000-IT[i];break;
			case 'c':des="Consultant";sal=Basic[i]+HRA[i]+32000-IT[i];break;
			case 'k':des="Clerk";sal=Basic[i]+HRA[i]+12000-IT[i];break;
			case 'r':des="Receptionist";sal=Basic[i]+HRA[i]+15000-IT[i];break;
			case 'M':des="Manager";sal=Basic[i]+HRA[i]+40000-IT[i];break;
			}
			System.out.println("Emp No.\t\tEmpName\t\tDepartment\t\tDesignation\t\tSalary");
			System.out.print(EmpNo[i]+"\t\t"+EmpName[i]+"\t\t"+Department[i]+"\t\t\t"+des+"\t\t"+sal);
			
			               
			
			
			}
		else {
			flag++;
		}
	}
	if(flag==7) {
		System.out.println("There is no employee with empid:"+Integer.parseInt(args[0]));
	}
	}
}