package com.githubbrowser.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.githubbrowser.api.**",
		"com.githubbrowser.domain.**",
		"com.githubbrowser.infrastructure.**"
})
@EntityScan("com.githubbrowser.infrastructure.**")
@EnableJpaRepositories("com.githubbrowser.infrastructure.**")
public class GithubbrowserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubbrowserApplication.class, args);
	}

}
