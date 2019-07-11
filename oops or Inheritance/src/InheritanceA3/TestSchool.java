package InheritanceA3;

public class TestSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person p=new Person("srinu","01/03/1999");
     System.out.println(p);
     Teacher t=new Teacher("Hardy","25/2/1985",122222,"lgorithmic mathematics");
     System.out.println(t);
     Student s=new Student("srinu","01/03/1999","160040135");
     System.out.println(s);
     CollegeStudent cs=new CollegeStudent("srinu","01/03/1999","160040135","KL University","Fourth");
     System.out.println(cs);
	}

}
