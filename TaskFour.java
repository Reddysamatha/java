package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskFour
{
    public void insertingData()
    {
    	try 
    	{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
			Statement st=con.createStatement();
			String sql="insert into students values('aparna','ap@gmail.com','hyd',965824714,98)";
			int i=st.executeUpdate(sql);
			if(i>0)
			System.out.println("data inserted");
			else
				System.out.println("error");
		} 
    	
    	catch (Exception e)
    	{
    		System.out.println(e);
	
		}
    	
    }
	public static void main(String[] args) 
	{
        TaskFour t=new TaskFour();
        t.insertingData();
	}
}
