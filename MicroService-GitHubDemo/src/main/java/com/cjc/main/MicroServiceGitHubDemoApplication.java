package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceGitHubDemoApplication {

	public void m1()
	{
		System.out.println("m1 ---> method");
	}

	public void m2()
	{
		System.out.println("m2 ---> method");
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceGitHubDemoApplication.class, args);
	}

}
