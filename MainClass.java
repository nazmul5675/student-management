package EntryPackage;


import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to student management system");
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		StudentOperation operation = new StudentOperation();
		int choice;
		
		while(true) {
			System.out.println("1 for student registration");
			System.out.println("2 for student search by id");
			System.out.println("3 for remove student by id");
			System.out.println("4 for search student by year");
			System.out.println("0 for exit");
			choice = scanner.nextInt();
			
			if(choice == 1) {
				operation.registration(students);
			}else if(choice == 2) {
				operation.searchById(students);
			}else if(choice == 3) {
				operation.delete(students);
			}else if(choice == 4) {
				operation.searchByYear(students);
			}else if(choice == 0) break;
			
		}
		System.out.println("Thank you for using our system");
	}
}
