package data;

import java.util.Date;

public class UserAccount {
	int UserId;
	String Fullname;
	String Username;
	String Password;
	String PhoneNumber;
	String Email;
	int Gender;
	String Address;
	int Status;
	String ImageUser;
	Date CreatedDate;
	Date UpdatedDate;
	
	public UserAccount() {
		
	}

	public UserAccount(int userId, String fullname, String username, String password, String phoneNumber, String email,
			int gender, String address, int status, String imageUser, Date createdDate, Date updatedDate) {
		super();
		UserId = userId;
		Fullname = fullname;
		Username = username;
		Password = password;
		PhoneNumber = phoneNumber;
		Email = email;
		Gender = gender;
		Address = address;
		Status = status;
		ImageUser = imageUser;
		CreatedDate = createdDate;
		UpdatedDate = updatedDate;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getGender() {
		return Gender;
	}

	public void setGender(int gender) {
		Gender = gender;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public String getImageUser() {
		return ImageUser;
	}

	public void setImageUser(String imageUser) {
		ImageUser = imageUser;
	}

	public Date getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}

	public Date getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		UpdatedDate = updatedDate;
	}
	
	
}
