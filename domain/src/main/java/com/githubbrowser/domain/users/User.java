package com.githubbrowser.domain.users;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;
import java.util.Optional;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

    @NonNull
    private final int id;

    @NonNull
    private final String login;

    @NonNull
    @Builder.Default
    private final Optional<String> name = Optional.empty();

    @NonNull
    private final String type;

    @NonNull
    private final String avatarUrl;

    @NonNull
    private final Instant createdAt;

    @NonNull
    private final int followersNumber;

    @NonNull
    private final int publicReposNumber;

    public int getCalculation() {
        return followersNumber == 0 ? 0 : (6 / followersNumber * (2 + publicReposNumber));
    }

}
