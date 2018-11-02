package getnews;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String PATH = "jdbc:mysql://localhost:3306/newstest";
	private ResultSet rs = null;
	private Connection conn = null;
	private PreparedStatement pre = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// ���ݿ�:��
	public ResultSet query(String sql) {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(PATH, "root", "123456");
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	// ���ݿ�:��ɾ��
	public void exec(String sql) {

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(PATH, "root", "123456");
			pre = conn.prepareStatement(sql);
			pre.execute();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	// ���ݿ�ر�����
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
