package com.PriceTrackApplication.Authentication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String email,email2;
    private String password;

    public UserDetails(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserDetails(String email2) {
    	 this.email2 = email2;
	}

	

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}

