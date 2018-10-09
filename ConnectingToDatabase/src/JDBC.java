import java.sql.*;

public class JDBC {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmnt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password");
			stmnt = con.createStatement();
			ResultSet R = stmnt.executeQuery("SELECT * FROM sakila.actor"); 
//			ResultSet R = stmnt.executeUpdate("INSERT INTO sakila.actor values(200, "Vinu", "Ruban"); // for INSERT! 
			
			while (R.next()) {
				
				int id = R.getInt("actor_id");
				String fname = R.getString("first_name");
				String lname = R.getString("last_name");
				String update = R.getString("last_update");
				
				System.out.println("ID: " + id + " -- Firstname: " + fname + " -- Lastname: " + lname + " -- Last Update: " + update);
				
			}
			
			R.close();
			stmnt.close();
			con.close();
		}
		
		catch(Exception se) {
			
		}
	}
	
}
