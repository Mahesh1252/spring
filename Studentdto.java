package com.netflix.springpractise.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Studentdto {
@Id
private String Email;
private int pwd;
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getPwd() {
	return pwd;
}
public void setPwd(int pwd) {
	this.pwd = pwd;
}


}
