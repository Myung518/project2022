package com.example.shop.controller;

import java.io.Serializable;

import com.example.shop.domain.Account;

@SuppressWarnings("serial")
public class UserSession implements Serializable {

	private Account account;
	
	public UserSession(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
}
