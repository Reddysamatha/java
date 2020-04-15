package collection;
import java.util.Scanner;
import java.util.TreeSet;
public class Top {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();  //6
		TreeSet ts=new TreeSet();   // 23 45 12 34 67 54
		for(int i=1;i<=n;i++)
		{
			ts.add(s.nextInt());			
		}

		System.out.println("Enter k value");
		  int k=s.nextInt();
		 if(k<=n)
		 {
		  while(ts.size()>k)
		 {
		ts.remove(ts.first());   
		 }
			System.out.println(ts.descendingSet());

		 }
		 else
		 {
			 System.out.println("k value should be less than "+n);
		 }


      
	}

}
