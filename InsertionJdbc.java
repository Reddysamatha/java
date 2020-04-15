package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertionJdbc {

	public static void main(String[] args) 
	{
		try {
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
		if (con!=null)
		{
			Statement stmt=con.createStatement();
			int i=stmt.executeUpdate("insert into Student values('sam','banglore','ccc@gmail.com','45')");
			if(i>0)
			{
				System.out.println("record is successfully");
			}
			else {
				System.out.println("error");
			}
		}
		else {
			System.out.println("no");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
   }
}


