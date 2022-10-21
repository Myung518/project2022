package com.example.shop;

import java.nio.charset.Charset;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.example.shop.service.ArtSellFacade;

@SpringBootApplication
public class ShopBootApplication  extends SpringBootServletInitializer implements CommandLineRunner{

	@Autowired
	ArtSellFacade artSell;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShopBootApplication.class);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ShopBootApplication.class, args);
	}

	@Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
