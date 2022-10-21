package com.example.shop.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Basket implements Serializable {
	private String userId;
	private String itemId;
	private Date basketTime;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public Date getBasketTime() {
		return basketTime;
	}
	public void setBasketTime(Date basketTime) {
		this.basketTime = basketTime;
	}
	
}
