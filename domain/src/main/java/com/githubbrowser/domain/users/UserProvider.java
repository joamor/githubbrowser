package com.githubbrowser.domain.users;

import java.time.Instant;

public interface UserProvider {

    Integer getId();

    String getLogin();

    String getName();

    String getType();

    String getAvatarUrl();

    Instant getCreatedAt();

    Integer getFollowersNumber();

    Integer getPublicReposNumber();

}
