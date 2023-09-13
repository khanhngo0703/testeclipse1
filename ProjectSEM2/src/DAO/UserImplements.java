package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.UserAccount;
import db.ConnectDB;

public class UserImplements implements UserDAO {

	@Override
	public UserAccount findUserByUsername(String username) {
		UserAccount ua = null;
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		con = ConnectDB.openConnection();
		try {
			ps = con.prepareStatement("SELECT * FROM UserAccount WHERE Username = ?");
			ps.setString(1, username);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				ua= new UserAccount();
				ua.setUserId(rs.getInt("UserId"));
                ua.setUsername(rs.getString("UserName"));
                ua.setPassword(rs.getString("Password"));
                ua.setFullname(rs.getString("Fullname"));
                ua.setPhoneNumber(rs.getString("PhoneNumber"));
                ua.setEmail(rs.getString("Email"));
                ua.setGender(rs.getInt("Gender"));
                ua.setImageUser(rs.getString("ImageUser"));
                ua.setAddress(rs.getString("Address"));
                ua.setCreatedDate(rs.getDate("CreatedDate"));
			}
		}catch (SQLException ex) {
            Logger.getLogger(UserImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
		return ua;
	}

	@Override
	public List<UserAccount> checkExistUsername(String oldUsername, String newUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> checkExistPhoneNumber(String oldPhoneNumber, String newPhoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAccount> checkExistEmail(String oldEmail, String newEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createNewUser(UserAccount ua) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserAccount> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(UserAccount ua) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePasswordUser(int userId, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserAccount getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
