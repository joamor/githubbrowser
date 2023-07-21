package com.githubbrowser.domain.users;

import java.time.Instant;

public interface UserProvider {

    int getId();

    String getLogin();

    String getName();

    String getType();

    String getAvatarUrl();

    Instant getCreatedAt();

    int getFollowersNumber();

    int getPublicReposNumber();

}
