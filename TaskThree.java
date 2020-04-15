package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskThree
{
	public void deletingRows()
	{
		try
		{
		  Class.forName("org.h2.Driver");
		  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
		  Statement st=con.createStatement();
		  String sql="delete from student1 where marks=99";
		  int i=st.executeUpdate(sql);
		  if(i>0)
		  {
			  System.out.println("row deleted");
		  }
        }
		catch(Exception  e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
        TaskThree t=new TaskThree();
        t.deletingRows();
	}
}

