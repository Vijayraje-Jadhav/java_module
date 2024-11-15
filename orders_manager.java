package Orders_management_system;

import java.util.*;


class my_exception extends Exception{

	public my_exception() {
		super();
	}

	public my_exception(String msg) {
		super(msg);
	}
	
	
}





public class orders_manager {
	ArrayList <Orders> olist = new ArrayList <Orders>();
	Orders o1 = new Orders();
	Scanner sc = new Scanner(System.in);
	
	
	
	public orders_manager() {
		olist.add(new Orders(01, "mama", new String[]{"rice", "fish", "underware", "shoes"}, 1450));
		olist.add(new Orders(03, "dhruv", new String[]{"punaya", "rashi", "birysnoi", "condom"}, 950));
		olist.add(new Orders(04, "bubaloo", new String[]{"jacket", "pen", "rumal", "shoes"}, 750));
		olist.add(new Orders(02, "vegiee", new String[]{"burger", "ramm", "pand", "chicken"}, 890));
		
		
	}
	
	public void print_all() {
		for (Orders o1: olist) {
			Collections.sort(olist);
			System.out.println(olist);
			break;
		}
	}
	
	public void print_all_sorted_id(){
		
		compare_to_operator coid = new compare_to_operator();
		for (Orders o1: olist) {
			
			Collections.sort(olist, coid);
			System.out.println(olist);
		}
	}
	

	public void print_all_sorted_name(){
		
		compare_strings coid = new compare_strings();
		for (Orders o1: olist) {
			
			Collections.sort(olist, coid);
			System.out.println(olist);
		}
	}
	
	
	
	public void  delete_item ()  throws my_exception{
		
try {
		int rn;
		System.out.println("Enter the id of order");
		rn = sc.nextInt();
		for (Orders o1: olist) {
			
			
			if (rn == o1.Id) {
				olist.remove(o1);
			break;
			}
			else {
				throw new my_exception("mama is gandu");
			}
		}
	}
	catch(my_exception e) {
		System.out.println(" mama ka dimag kehata hai ki : " + e.getMessage());
	}
	catch(Exception e) {
		System.out.println(" mama ka dimag kehata hai ki : " + e.getMessage());
	}
		
	}
	
	public void  update_item ()  throws my_exception{
		int rn1;
		System.out.println("Enter the id of order");
		rn1 = sc.nextInt();
		
		for (Orders o1: olist) {
			if (rn1 == o1.Id) {
				
				System.out.println("Enter the name");
				String r1 = sc.nextLine();
				

				System.out.println("Enter the products number you want to add between 1 to 5");
				int r2 = sc.nextInt();
				
					if (r2 <=5) {
						for (int i =0 ; i<r2; i++) {
							
							System.out.println(" Enter the Product names");
							o1.list[i]  = sc.next();
						}
					}
					else {
						System.out.println(" Enter the value between 1 to 5");
					}
					
					
					System.out.println("Enter the total price of the products");
					double rn3= sc.nextDouble();
			}
			
			
			
			
		}
	
	
	
	}
	
	
	
	}
	






