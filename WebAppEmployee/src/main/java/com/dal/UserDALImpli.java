package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbutil.DButil;
import com.pojo.Users;

public class UserDALImpli implements UserDAL {

	
	
	
	private Connection con;
	private PreparedStatement psmt;

	
	
	
	
	
	public UserDALImpli() 
	
	
	{
		System.out.println("getting connection");
		con = DButil.getCon();
		try {
			psmt = con.prepareStatement("select * from users where userName=? and userPassword=?");
			System.out.println("inside userDALimplented class constructor");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	
	
	
	
	@Override
	public Users Validation(String userName, String password) throws SQLException {
		System.out.println("inside com.dal -> userdalimplemnted class-> validation");
		System.out
				.println(" Validation(int userId, String password) :  userId:" + userName + "  ,password:" + password);

		psmt.setString(1, userName);
		psmt.setString(2, password);
		ResultSet rset = psmt.executeQuery();
		Users uobj = null;
		while (rset.next()) {
			// int userId, String userEamil, String userPassword
			uobj = new Users(rset.getInt("userId"), rset.getString("userName"), rset.getString("userPassword"));
		}
		return uobj;

	}
	
	public  void Cleanup() throws SQLException
	{
		System.out.println("cleaning up userdalimplemented");
		if(psmt!=null)
		psmt.close();
	}

}
