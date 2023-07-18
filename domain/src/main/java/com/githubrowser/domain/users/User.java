package com.githubrowser.domain.users;

import lombok.Data;

import java.time.Instant;

@Data
public class User {

    private final String id;

    private final String login;

    private final String name;

    private final String type;

    private final String avatarUrl;

    private final Instant createdAt;

    private final Integer followersNumber;

    private final Integer publicReposNumber;

}
