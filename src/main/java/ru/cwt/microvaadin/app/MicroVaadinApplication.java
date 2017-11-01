package ru.cwt.microvaadin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.cwt.microvaadin.vaadin")
public class MicroVaadinApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroVaadinApplication.class, args);
	}
}