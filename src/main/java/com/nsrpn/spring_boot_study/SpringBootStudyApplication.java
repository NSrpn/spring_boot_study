package com.nsrpn.spring_boot_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.nsrpn.spring_boot_study")
public class SpringBootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}

}
