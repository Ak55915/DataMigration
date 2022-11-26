package com.example.demo.user;

import org.hibernate.annotations.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@jakarta.persistence.Table(name="users")
public class User {
	    @Id
	    private int id;
	    private String status;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(int id, String status) {
			super();
			this.id = id;
			this.status = status;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", status=" + status + "]";
		}
	    
	    
}
