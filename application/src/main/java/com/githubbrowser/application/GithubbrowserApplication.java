package com.githubbrowser.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.githubbrowser.api.**",
		"com.githubbrowser.domain.**",
		"com.githubbrowser.infrastructure.**"
})
public class GithubbrowserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubbrowserApplication.class, args);
	}

}
