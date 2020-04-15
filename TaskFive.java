package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class TaskFive
{
    public void retrivingData()
    {
    	try
    	{
    	Class.forName("org.h2.Driver");
    	Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
    	Statement st=con.createStatement();
    	String sql="select * from student";
    	ResultSet str=st.executeQuery(sql);
    	while(str.next())
    	{
    		String name = str.getString("name");
            String email = str.getString("email");
            String city = str.getString("city");
            Long mobile = str.getLong("mobile");
            int marks=str.getInt("marks");
            System.out.print("name:" +name+"  ");
            System.out.print("email:" +email+"  ");
            System.out.print("city:" +city+"  ");
            System.out.println("mobile:" +mobile+"  ");
            System.out.println("marks:" +marks+"  ");
         }
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) 
	{
       TaskFive t=new TaskFive();
       t.retrivingData();
	}

}

