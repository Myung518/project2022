package com.example.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.example.shop.domain.Account;
import com.example.shop.service.ArtSellFacade;

@Component
public class AccountValidator implements Validator {

	@Autowired
	private ArtSellFacade artSell;

	public boolean supports(Class<?> clazz) {
		return Account.class.isAssignableFrom(clazz);
	}

	public void validate(Object obj, Errors errors) {
		Account account = (Account)obj; 
		
		System.out.println("���̵� �������̼� " + account.getUserId());
		System.out.println("�н����� �������̼� " + account.getPassword());

		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "USER_ID_REQUIRED", "�ʼ��׸��Դϴ�.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "USER_PASSWORD_REQUIRED", "�ʼ��׸��Դϴ�.");

		
		String inputUserId = account.getUserId();
		String inputPassword = account.getPassword();
		
//		if (artSell.getAccount(inputUserId) == null || artSell.getAccount(inputUserId).getQuit() == 1) {
//			System.out.println("You are an unregistered member. Please register as a member.");
//			errors.reject("userId", "��� ���� ���� ȸ���Դϴ�. ȸ�������� ���ּ���.");
//		}
//		else if (!artSell.getAccount(inputUserId).getPassword().equals(inputPassword)) {
//			System.out.println("input password" + inputPassword);
//			System.out.println("signed password" + artSell.getAccount(inputUserId).getPassword());
//
//
//			System.out.println("The password is incorrect. Please re-enter.");
//
//			errors.reject("password", "��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
//
//		}
		
	}
}