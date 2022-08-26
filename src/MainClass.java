import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher Amrita = new Teacher(1,"Amrita",30000);
		Teacher Sweta = new Teacher(2,"Sweta",35000);
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Amrita);
		teacherList.add(Sweta);
		
		
		Student Ayush = new Student(1,"Ayush",3);
		Student Kingson = new Student(2,"Kingson",4);
		List<Student> studentList = new ArrayList<>();
		studentList.add(Kingson);
		studentList.add(Ayush);
		
		
		School sps = new School(teacherList,studentList);
		
	
		Ayush.payFees(5000);
		//System.out.println("Sps has earned $: " + sps.getTotalMoneyEarned());
		Kingson.payFees(6000);
		System.out.println("Sps has earned $ : " +sps.getTotalMoneyEarned());
		
		System.out.println("-------Making SCHOOL PAY SALARY---");
		Amrita.recieveSlary(Amrita.getSalary());
		System.out.println("Sps has spent for salary "+ Amrita.getName()+ "and now has $ " + sps.getTotalMoneyEarned());
		
		Sweta.recieveSlary(Sweta.getSalary());
		System.out.println("Sps has spent for salary "+ Sweta.getName()+ "and now has $ " + sps.getTotalMoneyEarned());
		
		
	//	System.out.println(Ayush);
		}

}
