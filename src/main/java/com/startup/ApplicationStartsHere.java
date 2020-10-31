package com.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(JpaConfiguration.class)
public class ApplicationStartsHere {
	public static void main(String[] args) {
		try {
			SpringApplication.run(ApplicationStartsHere.class, args);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}
