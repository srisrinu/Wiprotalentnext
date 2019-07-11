package InheritanceA3;

public class Person {
	protected String name;
	protected String dateOfBirth;
	public Person(String name,String dateOfBirth){
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	public String getName() {
		return(name);
	}
	public String getDOB() {
		return(dateOfBirth);
	}
	@Override
	public String toString() {
		return("Person(name="+name+",dateOfBirth="+dateOfBirth+")");
	}

}
