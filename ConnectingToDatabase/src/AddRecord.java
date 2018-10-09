import java.sql.*;

public class AddRecord {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmnt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", "root", "password");
			stmnt = con.createStatement();
//			ResultSet R = stmnt.executeQuery("SELECT * FROM sakila.actor"); 
			stmnt.executeUpdate("INSERT INTO qac.info values(1, 'Vinu', 'Ruban')");
			
//			while (R.next()) {
//				
//				int id = R.getInt("actor_id");
//				String fname = R.getString("first_name");
//				String lname = R.getString("last_name");
//				String update = R.getString("last_update");
//				
//				System.out.println("ID: " + id + " -- Firstname: " + fname + " -- Lastname: " + lname + " -- Last Update: " + update);
//				
//			}
			
//			R.close();
			stmnt.close();
			con.close();
		}
		
		catch(Exception se) {
			
		}
	}
	
}
