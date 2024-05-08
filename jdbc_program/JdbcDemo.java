package jdbc_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		JdbcDemo jd= new JdbcDemo();
//		jd.retriveData();
//		jd.insertData();
		jd.jdbcConnection();
		

	}
	private void jdbcConnection() throws SQLException {
	//Retrive Data
		String url="jdbc:mysql://localhost:3306/excersice";
		String name="root";
		String password="";
		String query="select * from mark";
		
		Connection con=DriverManager.getConnection(url, name, password);
		Statement st=con.createStatement();
		ResultSet re=st.executeQuery(query);
		
		while(re.next()) {
			System.out.print("  ID : "+ re.getInt(1)+"\t");
			System.out.print("Name : "+ re.getString(2)+"\t \t");
			System.out.print(" GPA : "+ re.getFloat(3)+"\t");
			System.out.println();
			
		}
		st.close();
		con.close();
		
	}
	
	
//	private void insertData() throws SQLException {
//		String url="jdbc:mysql://localhost:3306/School";
//		String username="root";
//		String pass="";
//		String query="insert into branch values('3','aravi','kpm')";
//		
//		Connection con = DriverManager.getConnection(url, username, pass);
//		Statement st = con.createStatement();
//		int row = st.executeUpdate(query);
//		System.out.println("number of rows Affected:"+row);
//		con.close();
//		st.close();
//	}
//	
//	
//	private void retriveData() throws ClassNotFoundException, SQLException {
//		String url = "jdbc:mysql://localhost:3306/School";
//		String uname = "root";
//		String pass = "";
//		String query = "select * from branch";
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, uname, pass);
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query);
//
//		while(rs.next()) {
//		String userdata = rs.getInt(1) + " : "+rs.getString(2)+" : " + rs.getString(3);
//		System.out.println(userdata);
//		}
//		st.close();
//		con.close();
//		
//
//	}
	 

}
