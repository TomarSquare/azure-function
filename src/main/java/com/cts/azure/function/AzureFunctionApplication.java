package com.cts.azure.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cts.azure.function"})
public class AzureFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureFunctionApplication.class, args);
	}

}
