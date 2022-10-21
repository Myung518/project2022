package com.example.shop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.WebUtils;
import com.example.shop.service.ArtSellFacade;

@Controller
public class AccountFormController {

	@Value("editAccountForm")
	private String formViewName;

	@Value("main")
	private String successViewName;

	@Autowired
	private ArtSellFacade artsell;

	public void setArtSell(ArtSellFacade artsell) {
		this.artsell = artsell;
	}


}
