import java.sql.*;

/*
 * database operation
 */
public class GetConnection {
	public static void main(String[] args) throws SQLException {
		try {
			// ����Class.forName()����������������
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("�ɹ�����MySQL������");
		} catch (ClassNotFoundException e1) {
			System.out.println("�Ҳ���MySQL����!");
			e1.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/mysql"; // JDBC��URL
		// ����DriverManager�����getConnection()���������һ��Connection����
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(url, "root", "");
			// ����һ��Statement����
			stmt= conn.createStatement(); // ����Statement����
			System.out.print("�ɹ����ӵ����ݿ⣡");

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		stmt.close();
		conn.close();
	}



}
