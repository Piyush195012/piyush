import java.util.LinkedList;
import java.util.List;

public class JdbcTest {
	public static void main(String[]args) {

		List list=new LinkedList();
		list.add("piyush");
		list.add("piyush2");
		list.add("piyush3");
		list.add("piyush4");
	
		for(Object x:list)
		{
			System.out.println(x);
		}
	}
	
}
