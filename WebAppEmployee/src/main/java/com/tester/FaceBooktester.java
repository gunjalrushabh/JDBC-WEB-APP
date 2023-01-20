package com.tester;

import java.sql.SQLException;

import com.dbutil.DButil;

public class FaceBooktester {

	public static void main(String[] args) throws ClassNotFoundException {
		DButil db = new DButil();
		try {
			DButil.openConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
