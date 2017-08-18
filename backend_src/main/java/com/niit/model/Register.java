package com.niit.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Register {
	@Id
private String name;
private String password;
private String resetpwd;
private String email;
public String getName() {
	return name;
}
public void setName(String Name) {
	this.name = name;
		
}
public String getEmail() {
	return email;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getResetpwd() {
	return resetpwd;
}
public void setResetpwd(String resetpwd) {
	this.resetpwd = resetpwd;
}



}


