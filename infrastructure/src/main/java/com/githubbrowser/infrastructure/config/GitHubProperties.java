package com.githubbrowser.infrastructure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties("app.github")
public class GitHubProperties {

    private String token;

    private String usersUrl;

}

