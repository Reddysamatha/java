package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class insertion2 {

	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
			if (con!=null)
			{
				Statement stmt=con.createStatement();
				stmt.executeUpdate("insert into Student values('var','vij','bbb@gmail.com','67')");
				stmt.executeUpdate("insert into Student values('kar','hyd','aaa@gmail.com','70')");
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
