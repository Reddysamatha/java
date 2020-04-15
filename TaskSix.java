package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskSix
{
    public void update()
    {
    	try
    	{
    	   Class.forName("org.h2.Driver");
    	   Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
    	   Statement st=con.createStatement();
    	   String sql="update student set marks=99 where marks=35";
    	   int i=st.executeUpdate(sql);
    	   if(i>0)
    	   {
    		   System.out.println("row updated");
    	   }
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) 
	{
       TaskSix t=new TaskSix();
       t.update();
	}

}
