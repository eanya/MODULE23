package JAVA_LESSONS_STATIC;

public class LemonStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		Student logst[] = new Student[3];
		logst[0]= new Student();
		logst[1]= new Student();
		logst[2]= new Student();
		
		System.out.println(Student.getNoOfStudents());
		

	}

}
