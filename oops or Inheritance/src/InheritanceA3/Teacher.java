package InheritanceA3;

public class Teacher extends Person {
	private double Salary;private String Subject;
    public Teacher(String name,String dateOfBirth,double Salary,String Subject) {
    	super(name,dateOfBirth);
    	this.Salary=Salary;
    	this.Subject=Subject;
    }
    public String getSubject() {
    	return(Subject);
    }
    @Override
    public String getName() {
    	return(name);
    }
    public double getSalary() {
    	return(Salary);
    }
    @Override
    public String getDOB() {
    	return(dateOfBirth);
    	
    }
    @Override
    public String toString() {
    	return("Teacher(name="+name+",Salary="+Salary+",Subject="+Subject+",dateOfBirth="+dateOfBirth+")");
    }
    
}
