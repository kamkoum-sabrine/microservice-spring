package com.iteam;

import com.iteam.entity.Societe;
import com.iteam.repository.SocieteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceSocieteApplication implements CommandLineRunner {

	@Autowired
	SocieteRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ServiceSocieteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Societe(null, "A", 100));
		repo.save(new Societe(null, "B", 200));
		repo.save(new Societe(null, "C", 300));
	}

}