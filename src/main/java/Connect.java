import java.sql.*;

public class Connect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","system");
		System.out.println("Successfully Connected " + conn);
		Statement st = conn.createStatement();
		ResultSet rs=st.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
		st.close();
		conn.close();

	}

}
