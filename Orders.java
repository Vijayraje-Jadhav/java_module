package Orders_management_system;

import java.util.Arrays;

public class Orders implements Comparable<Orders> {
	int Id;
	String Cname;
	String[] list = new String[5];
	double price;
	
	
	public int compareTo(Orders that) {
		// TODO Auto-generated method stub
		
		if (this.price > that.price) {
			return 1;
		}
		if (this.price< that.price) {
			return -1;
		}
		return 0;
	}
	
	public Orders() {
		super();
	}
	public Orders(int id, String cname, String[] list, double price) {
		super();
		Id = id;
		Cname = cname;
		this.list = list;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Id=" + Id + ", Cname=" + Cname + ", list=" + Arrays.toString(list) + ", price=" + price ;
		
	}
	
	
	
	
}

