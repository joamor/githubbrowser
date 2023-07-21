package com.githubbrowser.infrastructure.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.githubbrowser.domain.users.UserProvider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GitHubUser implements UserProvider {

    private int id;

    private String login;

    private String name;

    private String type;

    @JsonProperty(value = "avatar_url")
    private String avatarUrl;

    @JsonProperty(value = "created_at")
    private Instant createdAt;

    @JsonProperty(value = "followers")
    private int followersNumber;

    @JsonProperty(value = "public_repos")
    private int publicReposNumber;

}
