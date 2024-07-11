package com.homeworkweek1.bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakeryApplication implements CommandLineRunner {
	@Autowired
	public Frosting frosting;
	@Autowired
	public Syrup syrup;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(frosting.bakecake());
		System.out.println(syrup.bakecake());
	}

	public static void main(String[] args) {
		SpringApplication.run(BakeryApplication.class, args);
	}

}
