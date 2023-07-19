package com.githubbrowser.infrastructure.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GitHubHeadersFactory {

    public static HttpHeaders createDefaultHeaders(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        return headers;
    }

}
