package com.java4all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MythymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(MythymeleafApplication.class, args);
	}

	@RequestMapping(value = "test",method = RequestMethod.GET)
	public String test(){
		return "测试";
	}
}
