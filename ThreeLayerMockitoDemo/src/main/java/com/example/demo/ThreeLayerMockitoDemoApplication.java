package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.*")
@SpringBootApplication
public class ThreeLayerMockitoDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ThreeLayerMockitoDemoApplication.class, args);
	}
	
	@Override
    public void run(String args[]) throws Exception 
    {
    }

}
