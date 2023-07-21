package com.githubbrowser.infrastructure.users;

import com.githubbrowser.infrastructure.config.GitHubHeadersFactory;
import com.githubbrowser.infrastructure.config.GitHubProperties;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class GitHubUserRestClient {

    private final RestTemplate restTemplate;
    private final GitHubProperties gitHubProperties;

    public Optional<GitHubUser> findUserByLogin(String login) {
        HttpHeaders headers = GitHubHeadersFactory.createDefaultHeaders(gitHubProperties.getToken());
        HttpEntity<GitHubUser> httpEntity = new HttpEntity<>(headers);
        String url = gitHubProperties.getUsersUrl() + "/" + login;
        try {
            ResponseEntity<GitHubUser> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, GitHubUser.class);
            return Optional.ofNullable(response.getBody());
        } catch (HttpClientErrorException exception) {
            return Optional.empty();
        }
    }

}
