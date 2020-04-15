package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class connection1 {

	public static void main(String[] args)  
	{
		try {	
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
		if(con!=null)
		{
			System.out.println("yes");
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
