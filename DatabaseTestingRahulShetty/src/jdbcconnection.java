import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String db ="jdbc:mysql://localhost:3306/qadbt";
		Connection  conn = DriverManager.getConnection(db, "root", "root");
		Statement  st=conn.createStatement();
		ResultSet rs =st.executeQuery("select * from employee where id=123;");
		rs.next();
		System.out.println(rs.getString("name"));
	}

}

/* Table
name	id		location	age
pgodi	123		bluru		25
agodi	456		dwr			9
svg	 	489		mys			35
adv		101		mum			32
mmt		112		chn			45
*/