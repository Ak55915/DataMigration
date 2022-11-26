package com.example.demo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


	
	@Entity(name="users")
	public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="user_id")
		private int userId;
		
		@Column(name="user_name")
		private String userName;
		
		@Column(name="user_email") 
		private String userEmail;
		
		@Column(name="user_password")
		private String userPassword;
		
		@Column(name="user_role")
		private String userRole;
		
		@Column(name="user_contact")
		private String userContact;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public String getUserRole() {
			return userRole;
		}

		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}

		public String getUserContact() {
			return userContact;
		}

		public void setUserContact(String userContact) {
			this.userContact = userContact;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(String userName, String userEmail, String userPassword, String userRole, String userContact) {
			super();
			this.userName = userName;
			this.userEmail = userEmail;
			this.userPassword = userPassword;
			this.userRole = userRole;
			this.userContact = userContact;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
					+ userPassword + ", userRole=" + userRole + ", userContact=" + userContact + "]";
		}
		
		
}
