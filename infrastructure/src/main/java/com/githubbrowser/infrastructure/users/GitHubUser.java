package com.githubbrowser.infrastructure.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.githubbrowser.domain.users.UserProvider;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GitHubUser implements UserProvider {

    private final Integer id;

    private final String login;

    private final String name;

    private final String type;

    @JsonProperty(value = "avatar_url")
    private String avatarUrl;

    @JsonProperty(value = "created_at")
    private Instant createdAt;

    @JsonProperty(value = "followers")
    private Integer followersNumber;

    @JsonProperty(value = "public_repos")
    private Integer publicReposNumber;

}
