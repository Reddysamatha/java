package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DetailsOfStudents
{ 
	public static void getdetails()
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
	    	Statement stmt=con.createStatement();
	    	ResultSet str=stmt.executeQuery("select * from students");
	    	while(str.next())
	    	{
	    		String name = str.getString("name");
	            String email = str.getString("email");
	            String city = str.getString("city");
	            Long mobileno = str.getLong("mobileno");
	            int marks = str.getInt("marks");
	            System.out.print("name:" +name+"  ");
	            System.out.print("marks:" +email+"  ");
	            System.out.print("gender:" +city+"  ");
	            System.out.println("Address:" +mobileno+"  ");
	            System.out.println("marks:" +marks+"  ");
	            
	         }
		} 
		catch (Exception e)
		{
		System.out.println(e);	
		}
    	
	}

	public static void main(String[] args)
	{
	DetailsOfStudents t=new DetailsOfStudents();
	t.getdetails();
	}

}
