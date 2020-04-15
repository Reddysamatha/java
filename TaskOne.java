
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TaskOne 
{
    public void connect()
    {
    	try
    	{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
			if(con!=null)
			{
				System.out.println("connection established");
			}
			else
			{
				System.out.println("error occured while connecting");
			}
			con.close();
		}
    	catch(ClassNotFoundException | SQLException e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args)
	{
         TaskOne j=new TaskOne();
         j.connect();
	}
}
