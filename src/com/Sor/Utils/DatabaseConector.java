/**
 * 
 */
package com.Sor.Utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * @author nightphonix
 *
 */

public class DatabaseConector {
	public Connection conn;
	private Statement statement;
	public static DatabaseConector db;

	private DatabaseConector() {
		try {
			MysqlDataSource ds = new MysqlDataSource();
			ds.setUrl("jdbc:mysql://localhost:3306/database1");
			ds.setUser("root");
			ds.setPassword("pass");
			conn = ds.getConnection();

		} catch (SQLException ex) {
			Logger.getLogger(DatabaseConector.class.getName()).log(Level.SEVERE, null, ex);
			ex.printStackTrace();
		}
	}

	/**
	 *
	 * @return MysqlConnect Database connection object
	 */
	public static synchronized DatabaseConector getDbCon() {
		if (db == null) {
			db = new DatabaseConector();
		}
		return db;

	}

	/**
	 *
	 * @param query
	 *            String The query to be executed
	 * @return a ResultSet object containing the results or null if not
	 *         available
	 * @throws SQLException
	 */
	public ResultSet query(String query) throws SQLException {
		statement = db.conn.createStatement();
		ResultSet res = statement.executeQuery(query);
		// statement.close();
		return res;
	}

	/**
	 * @desc Method to insert data to a table
	 * @param insertQuery
	 *            String The Insert query
	 * @return boolean
	 * @throws SQLException
	 */
	public String insert(String insertQuery, String columnIdName) throws SQLException {
		statement = db.conn.createStatement();
		int result = statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
		if (result != 0) {
			ResultSet rs = statement.getGeneratedKeys();
			String response = null;
			if (rs.next()) {
				response = rs.getString(columnIdName);

			}
			return response;
		} else
			return null;

	}

}
