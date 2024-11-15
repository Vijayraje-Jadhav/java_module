package librabry_management_system;
import java.util.*;




class book_unavailable extends Exception{
	
	 public book_unavailable() {
		super();
	}

	book_unavailable(String msg) {
		super( msg);
	}
	
}




class book_not_found extends Exception{
	
	 public book_not_found() {
		super();
	}

	 book_not_found(String msg) {
		super( msg);
	}
	
}




public class library_implementation {

	Scanner sc = new Scanner(System.in);
	
	library_declaration l1 = new library_declaration(); //instance
	
	ArrayList <library_declaration> lb = new ArrayList <library_declaration>();
	
	
	library_implementation() { //default constructor
		
		lb.add(new library_declaration(101, "Harrry Potter"));
		lb.add(new library_declaration(102, "Wings of fire"));
		lb.add(new library_declaration(103, "Hanuman"));
		lb.add(new library_declaration(104,"Ramayana"));
		lb.add(new library_declaration(105,"Mahabharata"));
		lb.add(new library_declaration(106,"Ramayana"));
		lb.add(new library_declaration(107,"Karna"));
		lb.add(new library_declaration(108,"Kalki"));
		lb.add(new library_declaration(109,"Panipath"));
		lb.add(new library_declaration(110,"Maharaja"));
		
	}
	
	void print_library(){
		
		System.out.println("Here are in the book library");
		
		for ( library_declaration l1 : lb) {
			System.out.println(l1);
		}
	}
	
	
	void borrowed_books() throws book_unavailable{ 
		
		
try { 
		int ch;
		int rn;
		int rn2;
		int rn3;
		int rn4;
		System.out.println("Press 1 for teacher and 2 for  student");
		ch = sc.nextInt();
		
		if (ch==1) {
		
	
		System.out.println("Enter the book id for borrowing the book. Remember you are a teacher so you can borrow maximum of 5 books Please enter how many books do you want");
		rn = sc.nextInt();
		boolean flag = false;
			for (int i=0; i<=rn ; i++) {
				System.out.println("Enter the book id you want from above");
				rn2 = sc.nextInt();
				for (library_declaration l1 : lb) {
					if (rn2 == l1.book_id) {
						flag = true;
						lb.remove(l1);
						System.out.println("the book having id "+ rn2+ " has been borrowed successfully");
						break;
					}
					else {
						throw new book_unavailable (" The book you are looking for is unavailable ");
					}
				}
			}
			if (flag = false) {
				System.out.println("Invalid Input");
			}
		
		}
		else if (ch == 2){
		boolean flag2= false;
			System.out.println("Enter the book id for borrowing the book. Remember you are a student/n so you can borrow maximum of 3 books Please enter how many books do you want");
			rn3 = sc.nextInt();
				for (int i =0; i<=rn3 ; i++) {
					System.out.println("Enter the book id you want from above");
					rn4 = sc.nextInt();
					for (library_declaration l1 : lb) {
						if (rn4 == l1.book_id) {
							flag2 = true;
							lb.remove(l1);
							System.out.println("the book having id "+ rn4+ " has been borrowed successfully");
							break;
						}
						else {
							throw new book_unavailable (" The book you are looking for is unavailable ");
						}
					}
				}
				if(flag2 = false) {
					System.out.println("Invalid Input");
				}
		}
		else {
			System.out.println(" You have entred the wrong input.Remember you are a teacher so you/n can borrow maximum of 5 books Please enter how many books do you want");
		}
		}
catch(book_unavailable e) {
			System.out.println(" book unavailable :: " +e.getMessage());
		}
catch(Exception e) {
			System.out.println(" Exception is found" +e.getMessage());
		}
	}
	
	
	void returning_books ()  throws book_not_found{
		int rn5;
		
		
		System.out.println("Enter the book id of the book you want to return");
		rn5= sc.nextInt();
		try {
		for (library_declaration l1 : lb){
			
			if (rn5 == l1.book_id) {
				
				System.out.println("Enter the book name you want to return");
				l1.book_name = sc.nextLine();
				break;
			}
			else {
				throw new book_not_found (" The book you are entering is not found ");
			}
			
		}
		}
		catch(book_not_found e) {
			System.out.println(" book not found accured" +e.getMessage());
			
		}
		catch(Exception e) {
			System.out.println(" Exception is found" +e.getMessage());
			
		}
	} 
	
	void add_books() {
		
	for (library_declaration l1 : lb)  {
			
			System.out.println(" enter the book id");
			l1.book_id = sc.nextInt();
			sc.nextLine();
			
			System.out.println(" enter the book name");
			l1.book_name = sc.nextLine();
			break;
			
			
	}
	
	}

}
