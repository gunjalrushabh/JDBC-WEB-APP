package com.dal;

import java.sql.SQLException;

import com.pojo.Users;

public interface UserDAL {

	Users Validation(String userName, String password) throws SQLException;
}
