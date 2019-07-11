package InheritanceA3;

public class CollegeStudent extends Student{
	protected String collegeName; protected String yrOfStudy;
	public CollegeStudent(String name,String dateOfBirth, String id,String collegeName,String yrOfStudy) {
		super(name,dateOfBirth,id);
		this.collegeName=collegeName;
		this.yrOfStudy=yrOfStudy;
	}
	@Override
	public String getId() {
		return(id);
	}
	public String getCollegeName() {
		return(collegeName);
	}
	public String getYrOfStudy() {
		return(yrOfStudy);
	}
	@Override
	public String toString() {
		return("CollegeStudent(id="+id+",collegeName="+collegeName+",yrOfStudy="+yrOfStudy+")");
	}

}
