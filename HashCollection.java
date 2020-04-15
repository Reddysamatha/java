package collection;
import java.util.HashSet;
public class HashCollection
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(new Integer(45));
		hs.add(74.5);
		hs.add("hai");
		hs.add(23);
		HashSet hs1=new HashSet();
		
		hs1.add(100);
		hs1.add(11);
		hs1.add(87);
		hs1.add("hello");
		
		hs.addAll(hs1);
		System.out.println(hs);
	
	}

}
