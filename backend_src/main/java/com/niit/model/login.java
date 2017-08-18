package com.niit.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class login {
	@Id
private String email;
private String password;
private double resetpwd;
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
public double getResetpwd() {
	return resetpwd;
}
public void setResetpwd(double resetpwd) {
	this.resetpwd = resetpwd;
}


}

