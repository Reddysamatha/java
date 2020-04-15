package collection;
import java.util.HashSet;
public class RemoveAll {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(new Integer(45));
		hs.add(74.5);
		hs.add("hai");
		hs.add(23);
	      HashSet hs1=new HashSet();
	      hs1.add(41);
	      hs1.add("hai");
	      hs1.add(23);
	      hs.removeAll(hs1);
	      System.out.println(hs);
	      

	}

}
