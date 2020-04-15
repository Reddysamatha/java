package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertingMutipleRows
{
    public void multipleLines()
    {
    	Scanner s=new Scanner(System.in);
    	String name=null,email=null,city=null;
    	Long mobileno;
    	int marks=0;
    	String sql=null;
    	try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
			Statement st=con.createStatement();
			System.out.println("how many rows do you want to insert");
			int n=s.nextInt();
			int i=1;
			while(i<=n)
			{
				System.out.println("enter name");
				name=s.next();
				System.out.println("enter email:");
				 email = s.next();
				System.out.println("enter city");
				city=s.next();
				System.out.println("enter mobileno");
				 mobileno = s.nextLong();
				System.out.println("enter marks");
				marks=s.nextInt();
				sql="insert into students values('"+name+"','"+email+"','"+city+"','"+mobileno+"','"+marks+"')";
				st.executeUpdate(sql);
				System.out.println("row inserted");
				i++;
			}
			con.close();
		}
    	catch (Exception  e)
    	{
			System.out.println(e);
		}
    }
	public static void main(String[] args)
	{
       InsertingMutipleRows t=new InsertingMutipleRows();
       t.multipleLines();
	}

}
