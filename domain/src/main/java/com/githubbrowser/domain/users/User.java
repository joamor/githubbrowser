package com.githubbrowser.domain.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

    @NonNull
    private final Integer id;

    @NonNull
    private final String login;

    @NonNull
    private final String name;

    @NonNull
    private final String type;

    @NonNull
    private final String avatarUrl;

    @NonNull
    private final Instant createdAt;

    @NonNull
    private final Integer followersNumber;

    @NonNull
    private final Integer publicReposNumber;

    public Integer getCalculation() {
        return followersNumber == 0 ? 0 : (6 / followersNumber * (2 + publicReposNumber));
    }

}
