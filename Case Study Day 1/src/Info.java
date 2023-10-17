//22/11/22
import java.util.Scanner;
public class Info {
	
	public Student create()
	{
		Student stu1=new Student(1, "Abc", "1/01/22");
		return stu1;
	}
	
	public void display(Student stu1)
	{
		System.out.println("Student ID: "+stu1.getStudId());
		System.out.println("Student Name: "+stu1.getStudName());
		System.out.println("Student DOB: "+stu1.getDob());
	}
}
