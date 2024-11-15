package librabry_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main_method_of_library {

	public static void main(String[] args) throws InputMismatchException{
		// TODO Auto-generated method stub
		library_implementation i1 = new library_implementation();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
try {		
		do {
			System.out.println("************ Welcome to the Library Management System **************");
			System.out.println(" Enter 1 for view all the library books");
			System.out.println(" Enter 2 for borrow the library books");
			System.out.println(" Enter 3 for update the library books");
			System.out.println(" Enter 4 for returning the library books");
			System.out.println(" Enter 5 for exit");
			System.out.println(" ********************************************************************");
			System.out.println(" Enter your choice ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
					i1.print_library();
			break;
			
			case 2:
					i1.borrowed_books();
			break;
			
			case 3:
					i1.returning_books();
			break;
			
			case 4:
				 	i1.add_books();
			break;
			
			case 5:
				System.out.println("Thank you for visiting our School Library");
			break;
			
			default:
				System.out.println("Invalid Input");
			break;
			
			}
			
			
		}while(choice!=5);
		
}
catch (InputMismatchException e) {
	System.out.println("the input is invalid " + e.getMessage());
}
catch(Exception e) {
	System.out.println(e);
}



	}

}
