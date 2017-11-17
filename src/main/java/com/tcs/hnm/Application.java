package com.tcs.hnm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Class Application.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.tcs.hnm")
@EntityScan(basePackages = "com.tcs.hnm")
@SpringBootConfiguration
public class Application {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}