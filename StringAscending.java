package collection;
import java.util.Scanner;
import java.util.TreeSet;
public class StringAscending {

	public static void main(String[] args) {
		int max=0,smax=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();  
		TreeSet ts=new TreeSet();   
		for(int i=1;i<=n;i++)
		{
			ts.add(s.next());			
		}
        System.out.println(ts);



	}

}
