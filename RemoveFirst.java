package collection;
import java.util.Scanner;
import java.util.TreeSet;
public class RemoveFirst {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();  
		TreeSet ts=new TreeSet();   
		for(int i=1;i<=n;i++)
		{
			ts.add(s.nextInt());			
		}
		System.out.println(ts);
		ts.remove(ts.first());   
		ts.remove(ts.first());   
		System.out.println(ts);


	}

}
