package com.referal.referApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class ReferApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferApiApplication.class, args);
		
		
		StringBuilder sb1= new StringBuilder("faheem");
	String	str1 = sb1.toString();
		 String str2=str1;
		System.out.println(str1==str2);
	}

}
