package collection;
import java.util.Scanner;
import java.util.TreeSet;
public class String {

	public static void main(java.lang.String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();  //6
		TreeSet ts=new TreeSet();   
		for(int i=1;i<=n;i++)
		{
			ts.add(s.nextInt());			
		}
        for(Object obj: ts)
        {
        	System.out.println(Integer.parseInt(obj.toString())+10);
        }


	}

}
