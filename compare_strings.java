package Orders_management_system;

import java.util.Comparator;

public class compare_strings implements Comparator<Orders>{

	@Override
	public int compare(Orders o1, Orders o2) {

		
		// TODO Auto-generated method stub
		return o1.Cname.compareTo(o2.Cname);
	}
	
}