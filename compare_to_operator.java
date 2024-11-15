package Orders_management_system;

import java.util.Comparator;

public class compare_to_operator implements Comparator<Orders> {

	@Override
	public int compare(Orders o1, Orders o2) {
		// TODO Auto-generated method stub
		
		if (o1.Id> o2.Id) {
			return 1;
		}
		if (o1.Id < o2.Id) {
			return -1;
		}
		
		return 0;
	}

}