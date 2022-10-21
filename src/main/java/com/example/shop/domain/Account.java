package com.example.shop.domain;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@SuppressWarnings("serial")
public class Account implements Serializable {

	private String userId;
	private String password;
	private String address;
	@Email(message ="�ùٸ� ������ �̸����� �Է��� �ֽʽÿ�.")
	private String email;
	@Pattern(regexp="^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$" ,message="format:(01x-xxx(x)-xxxx) �ùٸ� ������ �ڵ��� ��ȣ�� �Է��� �ֽʽÿ�.") 
	private String phone;
	private String name;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getAddress1() {
		return address;
	}

	public void setAddress1(String address1) {
		this.address = address1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
