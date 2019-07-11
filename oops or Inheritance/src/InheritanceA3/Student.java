package InheritanceA3;

public class Student extends Person {
	protected String id;
	public Student(String name,String dateOfBirth,String id) {
		super(name,dateOfBirth);
		this.id=id;
	}
	public String getId() {
		return(id);
	}
	@Override
	public String getName() {
		return(name);
	}
	@Override
	public  String getDOB() {
		return(dateOfBirth);
	}
	public String toString() {
		return("Student(id="+id+",name="+name+",dateOfBirth="+dateOfBirth+")");
	}

}
