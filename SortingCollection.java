package collection;
//WAP to accept n values and print Sorting order using collections
import java.util.Scanner;
import java.util.TreeSet;
public class SortingCollection {

	public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        System.out.println("Enter "+n +" values");
        TreeSet ts=new TreeSet();
        
        for(int i=0;i<n;i++)
        { 
        	ts.add(s.nextInt());
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j<n;j++)
        	{
        		ts[i]=ts[j];
        		
   
        	}
	}
 		 
		  		 

	}

}
