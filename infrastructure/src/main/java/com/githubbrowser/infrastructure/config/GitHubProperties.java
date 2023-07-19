package com.githubbrowser.infrastructure.config;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app.github")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GitHubProperties {

    private String token;

    private String urlUsers;

}
