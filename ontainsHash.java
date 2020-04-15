package collection;
import java.util.HashSet;
public class ontainsHash {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(new Integer(45));
		hs.add(74.5);
		hs.add("hai");
		hs.add(23);
	  HashSet hs1=new HashSet();
	  hs1.add(74.5);
	  hs1.add("hai");
		System.out.println(hs.contains(23));
		System.out.println(hs.containsAll(hs1));

	}

}
