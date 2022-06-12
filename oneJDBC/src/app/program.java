package app;

import java.sql.Connection;


import Db.DB;

public class program {
	public static void main (String args[]) {
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}
}
