package collegeportal.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	private static Connection con;
	public static Connection createConnection() {
	//Returning the address of connection databases
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//forName: factory method 
			//it creates the object implicitly
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","root");
		}
		catch(ClassNotFoundException | SQLException se) {
			se.printStackTrace();
		}
		return con;
	}
	/*
	 * public static void main(String[] args) { Connection
	 * con=DBConnection.createConnection(); System.out.println(con); }
	 */
	
}