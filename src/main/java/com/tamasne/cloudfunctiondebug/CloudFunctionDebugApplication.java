package com.tamasne.cloudfunctiondebug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Function;

@SpringBootApplication
public class CloudFunctionDebugApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudFunctionDebugApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

	@Bean
	public Function<String, String> reverse() {
		return s -> new StringBuilder(s).reverse().toString();
	}
}
