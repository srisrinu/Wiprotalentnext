package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
public class StudentMain {
    static Student data[]=new Student[10];
    static {
    	for(int i=0;i<data.length;i++) 
    		data[i]=new Student();
    	data[0]=new Student("sekar",new int[] {35,35,35});
    	data[1]=new Student(null,new int[] {35,35,35});
    	data[2]=null;
    	data[3]=new Student("Manoj",null);
    	data[4]=new Student("srinu",new int[] {100,100,99});
    	data[5]=new Student("roy",new int[] {100,100,100});
    	data[6]=new Student("SR",new int[] {95,95,95});
    	data[7]=new Student("$R",new int[] {98,95,98});
    	data[8]=new Student("SRinu",new int[] {95,85,96});
    	
    } 	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StudentService studentService=new StudentService();
     StudentReport studentReport=new StudentReport();
     System.out.println("Grades calculation");
     String x=null;
     for(int i=0;i<data.length;i++) {
    	 
     
     try {
    	 x=studentReport.validate(data[i]);
    	 
     }catch(NullNameException e) {
    	 x="NullNameException occured";
     }catch(NullMarksArrayException e) {
    	 x="NullMarksArrayException occured";
     }catch(NullStudentException e) {
    	 x="NullStudentException occured";
     }
     System.out.println("GRADE="+x);
     
	}
     System.out.println("Number of objects with Marks array as null="+studentService.findNumberOfNullMarks(data));
     System.out.println("Number of objects with Name as null="+studentService.findNumberOfNullNames(data));
     System.out.println("Number of objects that are entirely null="+studentService.findNumberOfNullObjects(data));
     
     

}
}
