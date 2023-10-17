//6/1/23
public class Student1Main {

	public static void main(String[] args) {
		Student1 stu = new Student1();
		
		stu.setStudId(1);
		stu.setStuName("ABC");
		stu.setStuPerct(99.123456);
		
		System.out.println("Student ID: "+stu.getStudId());
		System.out.println("Student Name: "+stu.getStuName());
		System.out.println("Student Percentage: "+stu.getStuPerct());
	}

}
