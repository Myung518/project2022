package com.example.shop.service;

import java.util.List;

import com.example.shop.domain.Account;



public interface ArtSellFacade {
	
	Account getAccount(String userId);

	Account getAccount(String userId, String password);

	void insertAccount(Account account);

	void updateAccount(Account account);
	
	void deleteAccount(String userId);

	List<String> getUsernameList();
	
	List<Account> viewAccountList();
}
