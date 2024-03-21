package com.referal.referApi;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.StaticApplicationContext;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class ReferApiApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(ReferApiApplication.class, args);
		
System.out.println("inside main method of the application");
		
		StringBuilder sb1= new StringBuilder("faheem");
	String	str1 = sb1.toString();
		 String str2=str1;
		System.out.println(str1==str2);
	}

}
