package com.example.shop.domain;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;;

@SuppressWarnings("serial")
public class Item implements Serializable {
	private String itemId;
	
	@NotBlank
	private String itemName;
	
	//@NotBlank
	@Min(0)
	private int Price;
	
	@NotBlank
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date RegistrationTime;
	
	//@NotBlank
	private String description;
	
//	@NotBlank
//	private String picture;
	
	@NotBlank
	private String sellerId;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Date getRegistrationTime() {
		return RegistrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		RegistrationTime = registrationTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
}
