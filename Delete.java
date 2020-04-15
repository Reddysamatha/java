package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Delete {
	public static void main(String[] args)
	{
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
			if (con!=null)
			{
				Statement stmt=con.createStatement();
				stmt.executeUpdate("delete from Student where name='varshitha'");
				stmt.executeUpdate("delete from Student where name='karthik'");
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
