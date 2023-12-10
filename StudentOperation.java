package EntryPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperation {
	Scanner scanner = new Scanner(System.in);
	
	public void registration(ArrayList<Student> students) {
		System.out.println("Please, enter name");
		String name = scanner.nextLine();
		System.out.println("Please, enter mobile number");
	    String mobile = scanner.next();
	    System.out.println("Please, enter a valid Id");
	    String id = scanner.next();
	    System.out.println("Please, enter student year");
	    int year = scanner.nextInt();
	    scanner.nextLine();
	    
	    Student student = new Student(name, mobile, id, year);
	    students.add(student);
	    System.out.println("One student is inserted. Now total studetns are: " + students.size()+"\n");
	}
	
	public void searchById(ArrayList<Student> students) {
		 System.out.println("Please, enter a valid Id");
		 String id = scanner.next();
		 
		 for(Student s : students) {
			 if(id.equalsIgnoreCase(s.id) == true) {
				 this.display(s);
				 return;
			 }
		 }
		 
		 System.out.println("No student is found");
	}
	
	public void searchByYear(ArrayList<Student> students) {
		 System.out.println("Please, enter a valid Id");
		 int year = scanner.nextInt();
		 
		 System.out.println("Searching students...");
		 
		 for(Student s : students) {
			 if(s.year == year) {
				 this.display(s);
			 }
		 }
		 
	}
	
	public void delete(ArrayList<Student> students) {
		System.out.println("Please, enter a valid Id");
		 String id = scanner.next();
		 
		 for(Student s : students) {
			 if(id.equalsIgnoreCase(s.id) == true) {
				 this.display(s);
				 System.out.println(s.name + ", this student is removed");
				 students.remove(s);
				 System.out.println("Removed successful, total students are: " + students.size());
				 return;
				 
			 }
		 }
		 
		 System.out.println("No student is found");
	}
	
	public void display(Student student) {
		System.out.println("Name: " + student.name);
		System.out.println("Mobile: " + student.mobile);
		System.out.println("Id: " + student.id);
		System.out.println("Year: " + student.year);
		System.out.println();
	}
}
