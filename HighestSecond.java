package collection;
import java.util.Scanner;
import java.util.TreeSet;
public class HighestSecond {

	public static void main(String[] args) {
		int max=0,smax=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();  //6
		TreeSet ts=new TreeSet();   // 23 45 12 34 67 54
		for(int i=1;i<=n;i++)
		{
			ts.add(s.nextInt());			
		}
        for(Object obj: ts)
        {
        	int value=Integer.parseInt(obj.toString());
        	if(max<value) // 67<62
        	{                       // 23 45 56 12 67 62 
        		smax=max;    // smax=56
        		max=value;   // max=67
        	}
        	else if(smax<value)
        	{
        		smax=value;  // 62
        	}
        }
        System.out.println("max : "+max);
        System.out.println("smax : "+smax);
        

	}

}
